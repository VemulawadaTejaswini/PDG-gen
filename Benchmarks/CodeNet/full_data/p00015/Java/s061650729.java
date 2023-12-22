import java.math.BigInteger;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BigInteger out=new BigInteger("1");
		for(int i=1;i<80;i++){
			out=out.multiply(new BigInteger("10"));
		}
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			BigInteger a=new BigInteger(sc.next());
			BigInteger b=new BigInteger(sc.next());
			a=a.add(b);
			if(a.min(out).equals(out))	System.out.println("overflow");
			else 	System.out.println(a.toString());
		}

	}

}