import java.io.*;
import java.util.*;

// Replace with public class Main
public class Main {
    public static void main(String[] args) throws IOException {
        lunlunSequence();
    }

    static void lunlunSequence() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        ArrayList<String> oneDigits = new ArrayList<>();
        TreeSet<Long> ordered = new TreeSet<>();
        for (long number = 0; number < 10; number++) {
            String sNumber = number+"";
            oneDigits.add(sNumber);
            ordered.add(Long.parseLong(sNumber));
        }
        HashMap<Integer, ArrayList<String>> suffixs = new HashMap<>();
        suffixs.put(1, oneDigits);
        int iter = 10;
        int row = 2;
        while (row <= iter) {
            if (ordered.size() > 100000) break;
            ArrayList<String> numbers = new ArrayList<>();
            for(String suffix : suffixs.get(row-1)) {
                for(String d : nextNumbers(suffix)) {
                    numbers.add(d);
                    long lNumber = Long.parseLong(d);
                    if (lNumber == 0) continue;
                    ordered.add(lNumber);
                }
            };
            suffixs.put(row, numbers);
            row++;
        }
        int j = 0;
        while (!ordered.isEmpty()) {
            long kth = ordered.pollFirst();
            if (N == j) {
                System.out.println(kth);
                break;
            }
            ++j;
        }
    }

    static String[] nextNumbers(String suffix) {
        char leading = suffix.charAt(0);
        int c = leading-'0';
        if (leading == '0') {
            return new String[] { "1" + suffix, "0" + suffix};
        } if (leading < '2') {
            return new String[] { (c-1)+suffix, (c)+suffix, (c+1)+suffix };
        } else if (leading < '9')  {
            return new String[] { (c-1)+suffix, (c)+suffix, (c+1)+suffix };
        } else {
            return new String[] { (c-1)+suffix, (c)+suffix };
        }
    }

}
