import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		Scanner buf = new Scanner(System.in);
		int n;
		boolean judge;
		BigInteger s1,s2;
		BigInteger sum;
		n = buf.nextInt();
		while(n > 0){
			judge = false;
			s1 = buf.nextBigInteger();
			s2 = buf.nextBigInteger();
			sum = s1.add(s2);
			if(s1.toString().length() > 80 || s2.toString().length() > 80){
				System.out.println("overflow");
				judge = true;
			}
			else if(sum.toString().length() > 80){
				System.out.println("overflow");
				judge = true;
			}
			if(!judge) System.out.println(sum);
			n--;
		}
	}
}