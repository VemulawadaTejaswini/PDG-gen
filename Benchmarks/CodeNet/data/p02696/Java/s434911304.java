import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        long B = sc.nextLong();
        long N = sc.nextLong();
        long ans = 0;
        for (long i = N; i >= 0; i--)
        {
            ans = Math.max(ans, (long)A * i / B - (long)(i / B));
        }
        System.out.println(ans);
    }
}
