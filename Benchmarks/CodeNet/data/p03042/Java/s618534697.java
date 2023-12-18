import java.util.*;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        scanner.close();

        char[] chars = S.toCharArray();

        // YYMMチェック
        boolean yymm = checkMM(chars[2], chars[3]);

        // MMYYチェック
        boolean mmyy = checkMM(chars[0], chars[1]);

        if (yymm && mmyy) {
            System.out.println("AMBIGUOUS");
        } else if (yymm) {
            System.out.println("YYMM");
        } else if (mmyy) {
            System.out.println("MMYY");
        } else {
            System.out.println("NA");
        }


//        System.out.println(System.currentTimeMillis() - startTime);
    }

    private static boolean checkMM(char seq1, char seq2) {
        int num = Character.getNumericValue(seq1)*10 + Character.getNumericValue(seq2);

        return (num > 0 && num <= 12);
    }
}
