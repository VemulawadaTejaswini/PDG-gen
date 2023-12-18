import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int nlen = n.length();
        int res = 0;
        
        for(int i=0; i<nlen; i++) {
            for(int j=i+1; j<nlen+1; j++) {
                String s = n.substring(i, j);
                BigInteger num = new BigInteger(s);
                if(num.mod(new BigInteger("2019")).compareTo(new BigInteger("0")) == 0) {
                    res++;
                }
            }
        }
        System.out.println(res);
	}
}