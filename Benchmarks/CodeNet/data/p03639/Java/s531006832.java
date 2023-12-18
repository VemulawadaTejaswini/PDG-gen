import java.util.Scanner;

public class Main {
    int n;
    int[] as;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        as = new int[n];
        for (int i = 0; i < n; i++)
            as[i] = sc.nextInt();
    }

    private void solve() {
        int mod4 = 0, mod2 = 0, mod1 = 0;
        for (int i = 0; i < n; i++) {
            if (as[i] % 4 == 0) {
                mod4++;
            }
            else if(as[i] % 2 == 0) {
                mod2++;
            }
            else {
                mod1++;
            }
        }
        if (mod2 % 2 != 0) {
            mod1++;
        }
            if (mod4 - mod1 >= -1) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
    }
}
