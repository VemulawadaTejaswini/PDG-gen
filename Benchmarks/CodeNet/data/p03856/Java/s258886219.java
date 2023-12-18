import java.util.Scanner;

public class Main {
    static final String[] t = {"dream", "dreamer", "erase", "eraser"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean flag = true;
        int i = 0;
        while(i < s.length()) {
            if (i + 4 > s.length()) {
                flag = false;
                break;
            }
            String sub = s.substring(i, i + 5);
            if (t[0].equals(sub)) {
                i += 5;
                if (i < s.length() && s.charAt(i) == 'r') {
                    i++;
                }
            } else if (t[2].equals(sub)) {
                i += 5;
                if (i < s.length() && s.charAt(i) == 'r') {
                    i++;
                }
            } else {
                flag = false;
                break;
            }
        }

        System.out.println(((flag)?"YES":"NO"));
    }
}
