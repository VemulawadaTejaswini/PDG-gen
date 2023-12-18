import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] s = new int [m];
        int[] c = new int [m];
        for (int i = 0; i < m; i++) {
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        if(m == 0 && n == 1) {
            System.out.println(0);
            return;
        }
        String[] ss = new String[n];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = "0";
        }
        for (int i = 0; i < m; i++) {
            int keta = s[i] - 1;
            ss[keta] = Integer.toString(c[i]);
        }
        String ans = "";
        for (int i = 0; i < ss.length; i++) {
            ans += ss[i];
        }
        int ans1 = Integer.parseInt(ans);
        ans = Integer.toString(ans1);
        if(ans.length() == n) {
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }
    }
}