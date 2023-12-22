import java.math.BigInteger;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		BigInteger ans = BigInteger.ONE;
		BigInteger t = new BigInteger("1000000000000000000");
		BigInteger a;
		for(int i=1;i<=n;i++){
			a = cin.nextBigInteger();
			ans=ans.multiply(a);
		}
		if(ans.compareTo(t)>0){
			System.out.println("-1");
		}else{
			System.out.println(ans);
		}
		
	}

}
