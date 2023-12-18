
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int a = 0;
        int bc = 0;
        long count = 0;
        int i = 0;
        while (i < s.length()) {
            boolean isUpdate = false;
            while (i < s.length() && s.charAt(i) == 'A') {
                ++a;
                ++i;
                isUpdate = true;
            }
            while (i + 1 < s.length() && s.charAt(i) == 'B' && s.charAt(i + 1) == 'C') {
                ++bc;
                i += 2;
                isUpdate = true;
            }
            count += bc * a;
            bc = 0;
            if (isUpdate == false) {
                ++i;
                a = 0;
            }
        }
        System.out.println(count);
    }
}
