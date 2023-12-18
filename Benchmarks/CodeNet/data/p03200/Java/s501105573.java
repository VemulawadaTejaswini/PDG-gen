import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                a[i] = 0;
            } else {
                a[i] = 1;
            }
        }
        long count = 0;
        boolean cont = true;
        while (cont) {
            cont = false;
            for (int i = 0; i < s.length() - 1; i++) {
                if (a[i] == 1 && a[i + 1] == 0) {
                    a[i] = 0;
                    a[i + 1] = 1;
                    count++;
                    cont = true;
                }
            }
        }
        System.out.println(count);
    }
}