import java.util.Arrays;
import java.util.Scanner;


public class Main {

	boolean[] sieve;
	final int MAX=10000000;
	Scanner sc;
	
	void makeSieve(){
		sieve=new boolean[MAX];
		Arrays.fill(sieve, true);
		sieve[0]=false;
		for(int i=2;i<=MAX;++i){
			if(sieve[i-1]){
				for(int j=i*2;j<=MAX;j+=i){
					sieve[j-1]=false;
				}
			}
		}
	}
	
	int solve(int n){
		int i;
		for(i=n;!(sieve[i-1]&&sieve[i-3]&&sieve[i-7]&&sieve[i-9]);--i);
		return i;
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		makeSieve();
		sc=new Scanner(System.in);
		int n;
		while((n=ni())!=0) System.out.println(solve(n));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}