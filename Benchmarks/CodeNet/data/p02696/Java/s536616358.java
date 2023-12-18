import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        long B = sc.nextLong();
        long N = sc.nextLong();
        long ans = 0;
        for (long i = 0; i <= N; i++)
        {
            ans = Math.max(ans, floor(true, A, i, B) - floor(false, A, i, B));
        }
        System.out.print(ans);
    }

    private static long floor(boolean first, int A, long x, long B)
    {
        if(first) return (int)A * x / B;
        else return x / B;
    }
}
