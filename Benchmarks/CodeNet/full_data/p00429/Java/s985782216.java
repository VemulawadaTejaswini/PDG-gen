import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            String t="";
            String s = sc.next();
            while (n-- > 0) {
                t = "";
                for (int i = 0; i < s.length(); i++) {
                    int c = 1;
                    char a = s.charAt(i);
                    while (i + 1 < s.length() && a == s.charAt(i + 1)) {
                        c++;
                        i++;
                    }
                    t += c + "" + a;
                }
                s = t;
            }
            System.out.println(t);
        }

    }
}

