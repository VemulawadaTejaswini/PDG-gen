import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        long S = sc.nextLong();
        long max = 1000000000*1000000000;
        if(S <= 1000000000){
            System.out.println("0 0 1 0 0 "+S);
        } else{
            long X2 = 1000000000;
            long Y3 = S/X2+1;
            long a = factorization(X2*Y3-S);
            System.out.println(X2*Y3-S);
            System.out.println("0 0 "+X2+" "+a+" "+(X2*Y3-S)/a+" "+Y3);
        }
    }
    
    static long factorization(long n){
        List<Long> arr = new ArrayList<Long>();
        long temp = n;
        for(long i = 2; i < Math.pow(n, 0.5)+1;i++){
            if(temp%i == 0){
                int cnt = 0;
                while(temp%i==0){
                    cnt ++;
                    temp /= i;
                }
                arr.add(i*cnt);
                if(temp <= 1000000000){
                    break;
                }
            }
        }
        long ret = 1;
        for(long a : arr){
            ret *= a;
        }
        return ret;
    }
}
