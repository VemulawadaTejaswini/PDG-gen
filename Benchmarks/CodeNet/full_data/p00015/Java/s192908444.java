import java.math.BigInteger;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		BigInteger a,b,c;
		while(n--!=0){
			a=sc.nextBigInteger();
			b=sc.nextBigInteger();
			c=a.add(b);
			System.out.println(c);
		}
	}
}