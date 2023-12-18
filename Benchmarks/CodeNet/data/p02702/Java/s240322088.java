import java.util.Scanner;

public class Main1{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int a[] = new int[2019];
        a[0] = 1;
        String s = in.next();
        int len = s.length(), x = 0, n = 1, ans = 0;
        for (int i = len - 1; i >= 0; i--) {
            x = (x + (s.charAt(i) - '0') * n) % 2019;
            ans += a[x];
            a[x]++;
            n = (n * 10) % 2019;
        }
        System.out.println(ans);
    }

}
