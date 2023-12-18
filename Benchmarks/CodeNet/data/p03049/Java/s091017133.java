import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count;
        count = 0;

        String NString = sc.next();
        int N;
        N = Integer.parseInt(NString);

        int a = 0;
        int b = 0;

        for (int i = 1; i <= N; i++) {
            String moji = sc.next();

            String first = moji.substring(0, 1);
            String end = moji.substring(moji.length() - 1);

            if (moji.contains("AB")) {
                count = count + 1;
            }

            if (first.equals("B")) {
                b = b + 1;
            }
            if (end.equals("A")) {
                a = a + 1;
            }
        }

        int min = Math.min(a, b);
        count = count + min;

        System.out.println(count);
    }
}