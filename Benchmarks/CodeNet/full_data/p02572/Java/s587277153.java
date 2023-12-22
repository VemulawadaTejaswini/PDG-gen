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
        long sum = a[0];
        for(int i = 1; i < n; i++){
            ans += (a[i] * sum) % 1000000007;
            sum += a[i];
            ans %= 1000000007;
        }

        System.out.println(ans);

    }
}
/*
5
2 4 6 8 10

 */