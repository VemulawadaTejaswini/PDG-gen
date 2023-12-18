import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long S = sc.nextLong();
        long result = -1;
        String x = String.valueOf(N);
        int ketaN = x.length();
        String y = String.valueOf(S);
        int ketaS = y.length();
        
        int start = 2;
        if(ketaS>1){
            start = (int)Math.pow(10,ketaS-2);
        }
        
        for(long i=start;i<=N+1;i++){
            long b=i;
            long n = N;
            long sum = 0;
            while(b<=n){
                sum += n%b;
                n = n/b;
                if(sum > S){
                    break;
                }
            }
            sum += n%b;
            if(sum == S){
                result = i;
                break;
            }
        }
        
        System.out.println(result);
        
    }
}
