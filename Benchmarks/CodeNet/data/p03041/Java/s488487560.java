import java.util.Scanner;

public class BC126A {

    String s;
    int n, k;

    public void solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        s = sc.next();

        String res = "";
        for (int i = 0; i < n; i++) {
            if (i == k-1) {
                res += Character.toLowerCase(s.charAt(i));
            } else {
                res += s.charAt(i);
            }

        }


        System.out.println(res);

    }
    public static void main(String[] args) {
        new BC126A().solve();

    }
}
