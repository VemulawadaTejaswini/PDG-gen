import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < k; i++) {
            s[i] = sc.next();
        }
        int y = n-1;
        String str = "";
        boolean b = false;
        while(b == false) {
            y++;
            str = Integer.toString(y);
            int d = 0;
            for (int i = 0; i < k; i++) {
                if (str.contains(s[i])) {
                    d++;
                }
            }
            if (d == 0) {
                b = true;
            }
        }
        System.out.println(str);
    }
}