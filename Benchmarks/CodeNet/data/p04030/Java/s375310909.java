
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                res = res + '0';
            }
            if (s.charAt(i) == '1') {
                res = res + '1';
            }
            if (s.charAt(i) == 'B' && res.length() > 0) {
                res = res.substring(0, res.length() - 1);
            }
        }
        System.out.println(res);
    }
}
