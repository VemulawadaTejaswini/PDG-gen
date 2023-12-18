import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean[] bs = new boolean[s.length()];
        boolean[] p = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                bs[i] = false;
            } else {
                bs[i] = true;
            }
            if (i % 2 == 0) {
                p[i] = false;
            } else {
                p[i] = true;
            }
        }
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < bs.length; i++) {
            if (bs[i] != p[i]) {
                counter1++;
            } else {
                counter2++;
            }
        }
        System.out.println(Math.min(counter1, counter2));
        sc.close();
    }
}