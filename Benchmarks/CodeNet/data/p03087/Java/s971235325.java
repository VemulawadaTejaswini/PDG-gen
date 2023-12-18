import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            String str = s.substring(l - 1, r);
            int cnt = 0;
            int index = str.indexOf("AC");
            while (index != -1) {
                cnt++;
                index = str.indexOf("AC", index + 1);
            }
            System.out.println(cnt);
        }
    }
}