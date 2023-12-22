import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }

        long ans = 0;
        long sum = 0;
        for(int i = 1; i < n; i++){
            sum += a[i - 1];
            ans += (a[i] * sum) % 1000000007;
            ans %= 1000000007;
        }

        System.out.println(ans % 1000000007);

    }
}
/*
5
2 4 6 8 10

 */