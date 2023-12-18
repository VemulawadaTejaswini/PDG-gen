import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String args[]) {
        int[] a = new int[55];
        int[] b = new int[55];
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        for (int i = 0; i < M; i++)
        {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        scan.close();
        int[] ans = new int[55];
        Arrays.fill(ans, 0);
        for (int i = 0; i < M; i++)
        {
            ans[a[i]]++;
            ans[b[i]]++;
        }
        for (int i = 1; i <= N; i++)
        {
            System.out.println(ans[i]);
        }
    }
}
