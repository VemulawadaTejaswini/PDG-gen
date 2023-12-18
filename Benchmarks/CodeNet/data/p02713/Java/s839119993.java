import java.util.*;

class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                int t = gcd(i,j);
                for(int k = 1;k <= n;k++){
                    ans += gcd(t,k);
                }
            }
        }

        System.out.println(ans);
    }

    static int gcd(int a,int b){
        return b==0? a:gcd(b,a%b);
    }
}