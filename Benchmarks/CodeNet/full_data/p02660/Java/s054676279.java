
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        System.out.println(solve(num));
    }

    private static long solve(long num){
        if(num==1)
            return 0;
        if(isPrime(num))
            return 1;
        long prime = 2;
        int count=0;
        while(prime<=num){
            long curr = prime;
            while(num%curr==0){
                num/=curr;
                curr*=prime;
                count++;
            }
            while(num%prime==0){
                num/=prime;
            }
            prime++;
        }
        return count;
    }

    private static boolean isPrime(long num){
        for(long n=2;n*n<=num;n++){
            if(num%n==0)
                return false;
        }
        return true;
    }

}