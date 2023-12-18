import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] b = new int[26];

        for (int i = 0; i < s.length(); ++i) {
            b[s.charAt(i)-'a'] += 1;
        }

        for (int i = 0; i < 26; ++i) {
            if (b[i] > 1) {
                System.out.println("no");
                return;
            }
        }

        System.out.println("yes");
    }
}