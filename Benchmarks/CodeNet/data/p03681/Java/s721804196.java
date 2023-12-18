import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(Math.abs(m-n) > 1){
            System.out.println(0);
            return;
        }
        long ans = 0;

        if(n == m){
            ans = hoge(n) * hoge(m) * 2 % 1000000007;
        }else {
            ans = hoge(n) * hoge(m) % 1000000007;
        }
        System.out.println(ans);
    }

    public static long hoge(long n){
        long sum = 1;
        for(int i = 1; i < n+1; i++){
            sum = sum * i % 1000000007;
            //System.out.println(sum);
        }
        return sum;
    }
}