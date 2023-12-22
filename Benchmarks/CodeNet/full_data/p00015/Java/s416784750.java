import java.math.BigInteger;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0; i < N; i++){
			String a = sc.next();
			String b = sc.next();
			BigInteger aa = new BigInteger(a);
			BigInteger bb = new BigInteger(b);
			if(a.length() > 80 || b.length() > 80)
				System.out.println("overflow");
			else
				System.out.println(aa.add(bb));
		}
		}
}