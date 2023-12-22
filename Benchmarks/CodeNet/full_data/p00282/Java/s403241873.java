import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	    BigInteger m = new BigInteger(in.next());
	    int n = in.nextInt();
	    if(m.equals(BigInteger.ZERO)) break;
	    BigInteger mn=BigInteger.ONE;
	    for(int i = 0; i < n; i++) mn = mn.multiply(m);      
	    BigInteger []ans = new BigInteger[18];
	    BigInteger a = BigInteger.ONE;
	    for(int i = 0; i < 4; i++) a = a.multiply(BigInteger.TEN);
	    int l = 0;
	    while(l < 18){
		BigInteger md = mn.mod(a);
		ans[l] = md;
		mn = mn.divide(a);
		l++;
	    }
	    String []anss = new String[]{"","Man","Oku","Cho","Kei", "Gai", "Jo", "Jou", "Ko",
	    	     "Kan", "Sei", "Sai", "Gok", "Ggs", "Asg", "Nyt", "Fks", "Mts"};

	    for(int i = l - 1; i >= 0; i--){
		if(ans[i].equals(BigInteger.ZERO)) continue;
		System.out.print(ans[i]+anss[i]);
	    }
	    System.out.println("");
	}
	

    }
}