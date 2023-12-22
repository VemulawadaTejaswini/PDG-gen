import java.util.*;
import java.math.*;

public class Main{

	public static BigInteger lcm(BigInteger x,BigInteger y){
		return (x.divide(x.gcd(y))).multiply(y);
	}

	public static BigInteger solve(int a[],int m[]){
		int x[] = {1,1,1};
		int c[] = {0,0,0};

		for(int i=0;i<3;i++){
			do{
				x[i] = (a[i] * x[i]) % m[i];
				c[i]++;
			}while(x[i] != 1);
		}

		return lcm(lcm(new BigInteger(Integer.toString(c[0])),
									 new BigInteger(Integer.toString(c[1]))),
							 new BigInteger(Integer.toString(c[2])));
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a[]=new int[3];
		int m[]=new int[3];
		while(true){
			for(int i=0;i<3;i++){
				a[i] = scan.nextInt();
				m[i] = scan.nextInt();
			}
			if(a[0] == 0) break;

			System.out.println(solve(a,m));
		}
	}
}