import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long k = sc.nextInt();
        long ans = 0;
        if(a < k){
            ans += a;
            k = k-a;
            k = k - b;
            if(k > 0) ans -= k;
        }
        else{
            ans = k;
        }
        System.out.println(ans);
    }
}