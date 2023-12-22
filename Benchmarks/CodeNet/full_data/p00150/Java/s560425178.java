import java.util.Arrays;
import java.util.Scanner;


public class Main {

	boolean[] sieve;
	Scanner sc;
	
	int ni(){
		return sc.nextInt();
	}
	
	void makeSieve(int max){
		sieve=new boolean[max+1];
		Arrays.fill(sieve,true);
		sieve[0]=false;
		for(int i=2;i<=max;++i){
			if(sieve[i-1]){
				for(int j=i*2;j<=max;j+=i){
					sieve[j-1]=false;
				}
			}
		}
	}
	
	void solve(int n){
		for(int i=n;i>4;--i){
			if(sieve[i-1]&&sieve[i-3]){
				System.out.println((i-2)+" "+i);
				break;
			}
		}
	}
	
	void io(){
		sc=new Scanner(System.in);
		int n;
		makeSieve(10000);
		while((n=ni())!=0){
			solve(n);
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}