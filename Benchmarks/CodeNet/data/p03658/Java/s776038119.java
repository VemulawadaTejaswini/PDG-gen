import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] l = new int[55];
        Arrays.fill(l, 100);
        for (int i = 0; i < N; i++)
            l[i] = scan.nextInt();
        scan.close();
        Arrays.sort(l);
        int ans = 0;
        for (int i = N - K; i <= K; i++)
            ans += l[i];
        System.out.println(ans);
    }
}
