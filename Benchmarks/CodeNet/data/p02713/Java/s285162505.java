import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= n; k++){
                    ans += gcd(gcd(i,j),k);
                }
            }
        }
        System.out.print(ans);

    }
    static int gcd(int a, int b){
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
}
