import java.util.*;
import java.math.BigInteger;

public class Main {// Main
	//ugh, doesn't seems to guarantee 1XXXX is optimal
	private static int f(BigInteger x){
		int tot = 0;
		for(int i = 0; i < x.toString().length(); i++)
			tot += x.toString().charAt(i)-'0';
		return tot;
	}
	
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        BigInteger x = new BigInteger(cin.nextLine());
        cin.close();
        BigInteger b = x;
        
        int res = 1234567;
        
        for(int i = 0; i < 1000000; i++){
        	res = Math.min(res, f(b));
        	b = b.add(x);
        }
        
        System.out.print(res);
    }
}