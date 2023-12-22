import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;

        if(k <= a){
            ans += k;
            System.out.println(ans);
            return;
        }else{
            ans += a;
            k -= a;
        }
        k -= b;
        if(k > 0)
            ans -= k;
        
        System.out.println(ans);
    }
}