import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] a = new int[n];
        int ecnt = 0;
        for (int i = 0; i < n; i++) {
            char tmp = s.charAt(i);
            if (tmp == 'E') {
                a[i] = 1;
                ecnt++;
            } else {
                a[i] = 0;
            }
        }
        int ans = ecnt;
        if (ans == n || ans == 0) {
            System.out.println(0);
            return;
        }
        int wcnt = 0;
        for (int i = 1; i < n; i++) {
            if (a[i - 1] == 1) {
                ecnt--;
            } else {
                wcnt++;
            }
            if (ans > ecnt + wcnt - a[i]) {
                ans = ecnt + wcnt - a[i];
            }
        }
        System.out.println(ans);

    }
}