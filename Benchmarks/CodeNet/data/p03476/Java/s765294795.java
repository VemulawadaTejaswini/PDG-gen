import java.util.*;

public class Main{

    /** 試し割り法による素数判定 */
    private boolean trialDivision(int n){
        if(n<2) return false;

        for(int i=2;i<=n;i++){
            if(i*i > n){
                break;
            }
            if(n%i==0){
                return false;
            }

        }
        return true;
    }

    private boolean nIsPrime(int n){
        return trialDivision(n);
    }

    private boolean nIsLike2017(int n){
        float f = (n+1)/2;
        int n2 = (int)f;
        if(f != n2){
            return false;
        }
        return nIsPrime(n) && nIsPrime(n2);        
    }

    private int solve(int l, int r){
        int result = 0;
        for(int i=l;i<=r;i++){
            if(nIsLike2017(i)){
                result ++;
            }
        }
        return result;
    }

    private void _main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            System.out.println(solve(sc.nextInt(), sc.nextInt()));
        }
        sc.close();
    }

    public static void main(String[] args){
            (new Main())._main(args);
    }
}
