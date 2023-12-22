import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main{

    /** ??????????????? */
    private static String DELIMITER = " ";

    private static List<String> answers = new ArrayList<>();

    private static boolean isOk = false;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = null;
        while ((firstLine = reader.readLine()) != null && !"".equals(firstLine)) {
            Header header = createHeader(firstLine.split(" "));
            String result = execute(reader, header);

            // System.out.println(result);

            if (!isOk) {
                answers.add("NO");
            }
            isOk = false;
        }

        for (String string : answers) {
            System.out.println(string);
        }
    }

    public static String execute(BufferedReader reader, Header header) throws IOException {
        List<Hint> hints = createHints(reader, header.hintNumber);
        boolean[] usedNumber = setUsedNumber(hints, header.digit);
        int[] answer = new int[header.digit];
        Arrays.fill(answer, -1);

        String result = "NO";

        for (int i = 0; i < 10; i++) {
            if (usedNumber[i]) {
                continue;
            }

            searchAnswer(0, hints, header.digit, answer, i, usedNumber, result);
        }

        return result;
    }

    public static void searchAnswer(int currentDigit, List<Hint> hints, int digit, int[] answer, int next,
            boolean[] usedNumber, String result) {

        if (currentDigit == digit - 1) {

            answer[currentDigit] = next;
            boolean ok = true;

            for (Hint hint : hints) {
                if (!hitAndBlow(hint, answer)) {
                    ok = false;
                    break;
                }
            }

            // ??????????????¨
            // for (int number : answer) {
            // System.out.print(number);
            // }
            // System.out.println();

            if (ok) {
                result = createResult(answer);
                answers.add(result);
                isOk = true;
            }
            return;
        }

        answer[currentDigit] = next;
        usedNumber[next] = true;

        // ??????????????¨
        // for (int number : answer) {
        // System.out.print(number);
        // }
        // System.out.println();
        for (int i = 0; i < 10; i++) {
            if (usedNumber[i]) {
                continue;
            }

            searchAnswer(currentDigit + 1, hints, digit, answer, i, usedNumber, result);
        }

        answer[currentDigit] = -1;
        usedNumber[next] = false;
        return;
    }

    public static String createResult(int[] answer) {
        StringBuilder builder = new StringBuilder();
        for (int i : answer) {
            builder.append(i);
        }

        return builder.toString();
    }

    public static boolean hitAndBlow(Hint hint, int[] answer) {
        int hit = 0;
        int blow = 0;

        for (int i = 0; i < answer.length; i++) {

            if (hint.number[i] == answer[i]) {
                hit++;
                continue;
            }

            for (int j = 0; j < answer.length; j++) {
                if (hint.number[i] == answer[j]) {
                    blow++;
                    break;
                }
            }
        }

        return hint.hit == hit && hint.blow == blow;
    }

    public static Header createHeader(String[] firstLine) {

        int digit = Integer.parseInt(firstLine[0]);
        int hintNumber = Integer.parseInt(firstLine[1]);

        return new Header(digit, hintNumber);
    }

    public static List<Hint> createHints(BufferedReader reader, int hintCount) throws IOException {
        ArrayList<Hint> hints = new ArrayList<>();
        for (int i = 0; i < hintCount; i++) {
            hints.add(createHint(reader.readLine().split(DELIMITER)));
        }

        return hints;
    }

    private static Hint createHint(String[] line) {

        String[] numberStr = line[0].split("");
        int[] number = new int[line[0].length()];
        for (int i = 0; i < line[0].length(); i++) {
            number[i] = Integer.parseInt(numberStr[i]);
        }

        int hit = Integer.parseInt(line[1]);

        int blow = Integer.parseInt(line[2]);

        return new Hint(number, hit, blow);
    }

    public static boolean[] setUsedNumber(List<Hint> hints, int digit) {
        boolean[] usedNumber = new boolean[10];
        if (digit != 10) {
            for (Hint hint : hints) {
                if (hint.hit + hint.blow == digit) {

                    for (int i = 0; i < 10; i++) {
                        boolean check = false;
                        for (int j = 0; j < digit; j++) {
                            if (hint.number[j] == i) {
                                check = true;
                                break;
                            }
                        }
                        if (!check) {
                            usedNumber[i] = true;
                        }
                    }
                    break;
                }
            }

        }
        return usedNumber;
    }
}

/**
 * 
 * ?????????????????±????´??????????
 *
 */
class Header {
    int digit;
    int hintNumber;

    public Header(int digit, int hintNumber) {
        super();
        this.digit = digit;
        this.hintNumber = hintNumber;
    }

}

/**
 * 
 * ??????????????????
 *
 */
class Hint {
    int[] number;
    int hit;
    int blow;

    public Hint(int[] number, int hit, int blow) {
        super();
        this.number = number;
        this.hit = hit;
        this.blow = blow;
    }

}