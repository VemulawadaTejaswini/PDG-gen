import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, M;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[] a = new int[N];
        float check = 0;
        for(int i = 0 ; i < N ; i++)
        {
            a[i] = sc.nextInt();
            check += a[i];
        }
        check = check*(1/(4f*M));
        int count = 0;
        for(int i = 0 ; i < N ; i++)
        {
            count += (a[i] >= check) ? 1 : 0;
        }
        System.out.println(count >= M ? "Yes" : "No");
    }
}
