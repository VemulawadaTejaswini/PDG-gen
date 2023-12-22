import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        ans += Math.min(a, k);
        k -= a+b;
        if(0 < k){
            ans -= k;
        }
        System.out.println(ans);
        sc.close();

    }

}
