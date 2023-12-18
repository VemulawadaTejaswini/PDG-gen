import java.util.*;
public class Main{
    public static int gcd(int a, int b){
        while(true){
            if(a == 0) return b;
            b %= a;
            if(b == 0) return a;
            a %= b;
        }
    }
    public static int lcm(int a, int b){
        if(gcd(a,b)>0){
            return a/gcd(a,b) * b;
        }else{
            return 0;
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;
        int ans = 1;
        for(int i=0; i<n; i++){
            t = sc.nextInt();
            ans = lcm(ans, t);
        }
        System.out.println(ans);
    }
}
