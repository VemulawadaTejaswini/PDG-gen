import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            StringBuffer t = new StringBuffer();
            String s = sc.next();
            while (n-- > 0) {
                t = new StringBuffer();
                for (int i = 0; i < s.length(); i++) {
                    int c = 1;
                    char a = s.charAt(i);
                    while (i + 1 < s.length() && a == s.charAt(i + 1)) {
                        c++;
                        i++;
                    }
                    t.append(c + "" + a);
                }
                s = t.toString();
            }
            System.out.println(t);
        }

    }
}

