import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        int i = 0;
        int j = 0;
        int ans = 0;
        for (i = 0; i < N - 1; i++) {
            for (j = i+1; j < N; j++) {
                ans += d[i] * d[j];
            }
        }

        System.out.println(ans);
    }
}
