import java.util.Arrays;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        BigInteger[] ary = new BigInteger[n];
        for(int i=0; i<n; i++){
            String s = sc.next();
            ary[i] = new BigInteger(s);
        }
        BigInteger ans = new BigInteger("1");
        for(int i=0; i<n; i++){
            ans = ans.multiply(ary[i]);
        }
        if(ans.compareTo(new BigInteger("1000000000000000000")) > 0){
            System.out.println(-1);
        }
        else{
            System.out.println(ans);
        }
    }
}