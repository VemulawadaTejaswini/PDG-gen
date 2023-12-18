import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int flag = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < s.length(); i++) {
                if (c == s.charAt(i)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(c);
                System.exit(0);
            }
            flag = 0;
        }
        System.out.println("None");
    }
}
