import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in);

        String S;
        do {
            S = stdIn.nextLine();
        } while (S.length() < 4 || 10 < S.length());

        System.out.println(S);

        if (S.indexOf('A') == 0) {
            int count1 = 0;
            String str1;
            str1 = S.substring(2, S.length() - 1);
            for (int i = 0; i < str1.length(); i++) {
                if (str1.indexOf('C') == i) {
                    count1++;
                }
            }

            if (count1 == 1) {
                CheckCapsNumbers(S);
                // System.out.println("AC");
            }

            else
                System.out.println("WA");
        } else
            System.out.println("WA");

    }

    static void CheckCapsNumbers(String a) {
        String str2;
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            str2 = a.substring(i, i + 1);

            if (str2.toUpperCase().equals(str2)) {
                count++;
            }

        }

        if (count == 2) {
            //System.out.println(count);
            System.out.println("AC");
        }

        else
            System.out.println("WA");

    }

}
