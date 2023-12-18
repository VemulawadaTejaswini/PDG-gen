import java.util.*;
import java.util.function.LongUnaryOperator;
class Main {
    static int n,gcd,ans;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        gcd = 0;
        ans = 0;
        for(int i = 1;i<=n;i++){
            for(int j =1; i<=n;j++){
                for(int k =1;i<=n;k++){
                    ans += gcd(i,j,k);
                    }
                }
            }
        System.out.println(ans);
        }
        static int gcd(int a,int b,int c){
            int gcd = 0;
            for (int l = 1;l<=c;l++){
                if(a/l==0&&b/l==0&&c/l==0){
                    gcd = l;
                }
            }
            return c;
        }
    }
