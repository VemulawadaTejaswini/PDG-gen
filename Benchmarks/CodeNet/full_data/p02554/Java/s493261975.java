import java.util.*;
public class Ubiquity {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int m=1000000007;
		System.out.println(fastexpo(10,n,m)-fastexpo(9,n,m)-fastexpo(9,n,m)+fastexpo(8,n,m));
	}
	
	static long fastexpo(long x,long y,long modulus){
		if(y==0) return 1;
		if(y==1) return x;
		long R=fastexpo(x,y/2,modulus);
		if(y%2==0) return ((R%modulus)*(R%modulus))%modulus;
		else return ((R%modulus)*(R%modulus)*(x%modulus))%modulus;
	}

}
