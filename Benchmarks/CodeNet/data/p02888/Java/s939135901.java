import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }

        int ans = solve(n, l);
        System.out.println(ans);
    }

    static int solve(int n, int[] l) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int a = l[i];
                    int b = l[j];
                    int c = l[k];

                    if (a < b + c && b < c + a && c < a + b) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}
