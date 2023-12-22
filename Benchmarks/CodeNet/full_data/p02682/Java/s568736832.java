import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
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