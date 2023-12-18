import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        BigInteger a = new BigInteger(S1);
        BigInteger b = new BigInteger(S2);
        System.out.println(judge(a,b));
    }
    static String judge(BigInteger a, BigInteger b){
        int t = a.compareTo(b);
        if(t==0){
            return "EQUAL";
        }else if(t>0){
            return "GREATER";
        }else{
            return "LESS";
        }
    }
}
