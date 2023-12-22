import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, K, d;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        int[] count = new int[N];
        for(int i = 0 ; i < K ; i++)
        {
            d = sc.nextInt();
            int a[] = new int[d];
            for(int j = 0 ; j < d ; j++)
            {
                a[j] = sc.nextInt();
                count[a[j]-1] = 1;
            }
        }
        int dem = 0;
        for(int i = 0 ; i < N ; i++)
        {
            dem += count[i] == 1 ? 1 : 0;
        }
        System.out.println(N - dem);
    }
}
