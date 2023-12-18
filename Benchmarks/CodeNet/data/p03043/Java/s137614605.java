import java.util.*;
import java.util.Map;
import java.util.TreeMap;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int K = sc.nextInt();
        double ans = 0;

        for(int i=1; i<=N; i++){
            double p = 1.0 / N;
            int a = i;
            for(int j=0; j<=18; j++){
                if(a>=K){
                    p *= Math.pow((double)1 / 2, j);
                    break;
                }
                a *= 2;
            }
            ans += p;
        }
        System.out.println(ans);
    }
}