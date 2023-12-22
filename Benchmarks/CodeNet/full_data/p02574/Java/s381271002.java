import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int min = 1000000000;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
            min = Math.min(a[i], min);
        }
        boolean isCoprime = true;
        for(int i = 1; i < n; i++){
            if(!gcd(a[0], a[i])){
                isCoprime = false;
                break;
            }
        }
        if(isCoprime){
            System.out.println("pairwise coprime");
            return;
        }
        int[] b = new int[n];
        System.arraycopy(a, 0, b, 0, n);
        for(int i = 2; i < Math.sqrt(min); i++){
            for(int j = 0; j < n; j++){
                if(b[j] % i != 0) break;
                if(j == n - 1){
                    System.out.println("not coprime");
                    return;
                }
            }
        }
        System.out.println("setwise coprime");
        scan.close();
    }

    boolean gcd(int a, int b){
        if(a <= 1 || b <= 1) return true;
        for(int i = 2; i < Math.sqrt(Math.min(a, b)); i++){
            if(a % i == 0 && b % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
