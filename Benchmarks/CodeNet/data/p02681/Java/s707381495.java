import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                String S = scan.next();
                String T = scan.next();
                int S_length = S.length();
                int T_length = T.length();
                int flag = 1;

                for (int i = 0; i < S_length; i++) {
                        char s = S.charAt(i);
                        char t = T.charAt(i);
                        if (!(s == t)) {
                                System.out.println("No");
                                flag = 0;
                                break;
                        }
                }

                if (flag == 1) {
                        System.out.println("Yes");
                }
        }
}