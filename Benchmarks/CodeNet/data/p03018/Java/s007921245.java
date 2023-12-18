import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.next();
            char[] cs = s.toCharArray();
            int count = 0;
            int countA = 0;
            for (int i = 0; i < cs.length;) {
                if (cs[i] == 'A') {
                    countA++;
                    i++;
                    continue;
                }
                if (i + 1 < cs.length && cs[i] == 'B' && cs[i + 1] == 'C') {
                    count += countA;
                    i += 2;
                    continue;
                }
                countA = 0;
                i++;
            }
            System.out.println(count);
        }
    }
}
