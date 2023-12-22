import java.util.*;
public class Main {
	public static void main(String[] args){
		final int MAX=999999;
		Scanner sc=new Scanner(System.in);
		boolean[] prime=primeList(MAX);
		while(sc.hasNextInt()){
			int n=sc.nextInt();
			int cnt=0;
			for(int i=0;i<=n;i++){
				if(prime[i]) cnt++;
			}
			System.out.println(cnt);
		}
		sc.close();
	}
	
	static boolean isPrime(int n){
		if(n<2) return false;
		for(int i=2;i*i<n;i++){
			if(n%i==0) return false;
		}
		return true;
	}
	
	static boolean[] primeList(int n){
		boolean[] prime=new boolean[n+1];
		for(int i=2;i<=n;i++) prime[i]=true;
		for(int i=2;i*i<n;i++){
			if(isPrime(i)){
				for(int j=i+i;j<=n;j+=i){
					prime[j]=false;
				}
			}
		}
		return prime;
	}
}