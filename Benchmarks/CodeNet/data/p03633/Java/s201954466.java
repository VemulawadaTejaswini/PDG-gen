import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        BigInteger ans = BigInteger.ONE;
        for(int i=0;i<n;i++){
            ans = lcm(ans, new BigInteger(sc.next()));
        }
        System.out.println(ans);
    }
    static BigInteger gcd(BigInteger a, BigInteger b){
        return a.gcd(b);
    }
    static BigInteger lcm(BigInteger a, BigInteger b){
        return a.multiply(b).divide(gcd(a,b));
    }}
