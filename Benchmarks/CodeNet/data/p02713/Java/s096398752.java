import java.util.*;
import java.util.function.LongUnaryOperator;
class Main {
    static int n;
    static long ans;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ans = 0;
        for(int i = 1;i<=n;i++){
            for(int j =1; i<=n;j++){
                for(int k =1;i<=n;k++){
                    ans +=(long) gcd(gcd(i,j),k);
                    }
                }
            }
        System.out.println(ans);
        }
        static int gcd(int a,int b){
                int r = 0;
                if (a < b) {
                    int tmp;
                    tmp = a;
                    a = b;
                    b = tmp;
                }
                r = a % b;
                while (r != 0) {
                    a = b;
                    b = r;
                    r = a % b;
                }
                return b;
        }
    }
