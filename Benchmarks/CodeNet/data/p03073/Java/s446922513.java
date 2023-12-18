import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int num = (s.length() / 2) + s.length() % 2;
        String s1 = "10".repeat(num).substring(0, s.length());
        String s2 = "01".repeat(num).substring(0, s.length());

        int diff1 = 0;
        int diff2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s1.charAt(i)) diff1++;
            if (s.charAt(i) != s2.charAt(i)) diff2++;
        }

        System.out.println(diff1 > diff2 ? diff2 : diff1);
    }
}
