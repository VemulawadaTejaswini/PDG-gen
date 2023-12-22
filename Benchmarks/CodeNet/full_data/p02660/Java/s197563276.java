import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int ans = 0;
        boolean isPrime = true;


        long currentN = N;

        for(int i=2;i <= 10000000;i++){
            if(currentN % i == 0){
                ans++;
                currentN /= i;
                isPrime = false;
            }
        }

        if(isPrime){
            ans++;
        }




        if(N == 1){
            System.out.println(0);
        } else {
            System.out.println(ans);
        }






    }

}
