import java.util.*;


public class Main {
	
	void AOJ0044(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			for(int i=n-1; i>1; i--){
				if(isPrime(i)){
					System.out.print(i+" ");
					break;
				}
			}
			for(int i=n+1; ; i++){
				if(isPrime(i)){
					System.out.println(i);
					break;
				}
			}
		}
	}
	
	void AOJ0009(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int count=0;
			boolean[] prime = new boolean[n+1];
			Arrays.fill(prime, true);
			for(int i=2; i<=n; i++){
				if(prime[i]){
					count++;
					for(int j=i+i; j<=n; j+=i)	prime[j]=false;
				}
			}
			System.out.println(count);
		}
	}
	
	ArrayList<Integer> Sieve(int n){
	     ArrayList<Integer> prime = new ArrayList<Integer>();
	     if(n<2)	return prime;
	     boolean[] list = new boolean[n];
	     Arrays.fill(list, true);
	     list[1]=false;
	     for (int i=2; i<n; i++) {
	          if (list[i]) {
	               prime.add(i);
	               for (int j=i+i; j<n; j+=i)	list[j] = false;
	          }
	     }
	     return prime;
	}
	
	boolean isPrime(int n){
		for(int i=2; i*i<=n; i++){
			if(n%i==0)	return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new Main().AOJ0044();
	}

}