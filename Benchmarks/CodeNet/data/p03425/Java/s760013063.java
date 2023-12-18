import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[5];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.charAt(0) == 'M') {
                a[0]++;
            } else if (s.charAt(0) == 'A') {
                a[1]++;
            } else if (s.charAt(0) == 'R') {
                a[2]++;
            } else if (s.charAt(0) == 'C') {
                a[3]++;
            } else if (s.charAt(0) == 'H') {
                a[4]++;
            }
        }
        long ans = a[0]*a[1]*a[2] + a[0]*a[1]*a[3] + a[0]*a[1]*a[4] + a[0]*a[2]*a[3] + a[0]*a[2]*a[4] +
                    a[0]*a[3]*a[4] + a[1]*a[2]*a[3] + a[1]*a[2]*a[4] + a[1]*a[3]*a[4] + a[2]*a[3]*a[4];
        System.out.println(ans);
    }
}
