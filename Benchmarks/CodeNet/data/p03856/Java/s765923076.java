import java.util.Scanner;

public class Main {
    static final String[] t = {"dream", "dreamer", "erase", "eraser"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean flag = true;
        int i = 0;
        while(i < s.length()) {
            if (i + 5 > s.length()) {
                flag = false;
                break;
            }
            String sub = s.substring(i, i + 5);
            if (t[0].equals(sub)) {
                if (i + 5 < s.length() && s.charAt(i + 5) == 'r') {
                    i += 6;
                }
                i += 5;
            } else if (t[2].equals(sub)) {
                if (i + 5 < s.length() && s.charAt(i + 5) == 'r') {
                    i += 6;
                }
                i += 5;
            } else {
                flag = false;
                break;
            }
        }

        System.out.println(((flag)?"YES":"NO"));
    }
}
