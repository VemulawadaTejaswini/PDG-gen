import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String S = sc.next();
        sc.close();

        int n = S.length();
        int cnt = 0;
        for (int i=0; i<n/2; i++) {
            if (!S.substring(i, i+1).equals(S.substring(n-i-1, n-i))) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}