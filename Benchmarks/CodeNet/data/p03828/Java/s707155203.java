import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		long Nfac=factorial(N);
		System.out.println(Nfac);
		long num=factor(Nfac);
		in.close();
		System.out.println(num%1000000007);
	}
	
	public static long factorial(int n){
		if(n==1)return 1;
		else return n*factorial(n-1);
	}
	
	public static long factor(long nfac){
		long count=2;
		for(int i=2;i<=nfac/2;i++){
			if(nfac/i==i){count++;break;}
			if(nfac%i==0)count++;
		}
		return count;
	}
}