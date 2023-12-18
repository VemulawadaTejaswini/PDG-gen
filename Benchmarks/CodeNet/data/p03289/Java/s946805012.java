import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();

        if (s[0] != 'A') {
            System.out.println("WA");
            return;
        }

        int countC = 0;
        int position = 0;
        for (int i = 2; i < s.length-1; i++) {
            if (s[i] == 'C') {
                countC++;
                position = i;
            }
        }

        if (countC != 1) {
            System.out.println("WA");
            return;
        }

        for (int i = 1; i < s.length; i++) {
            if (i == position) continue;
            if (Character.isUpperCase(s[i])) {
                System.out.println("WA");
                return;
            }
        }

        System.out.println("AC");
    }
}