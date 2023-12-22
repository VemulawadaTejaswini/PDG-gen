import java.util.*;


public class Main {
	
	void AOJ0222(){
		int MAX=10000001;
		boolean[] list = new boolean[MAX+1];
		Arrays.fill(list, true);
		list[1]=false;
		for(int i=2; i<=MAX; i++) {
			if(list[i]) {
				for (int j=i+i; j<+MAX; j+=i)	list[j] = false;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)	break;
			for(int i=n; i>6; i--){
				if(list[i] && list[i-2] && list[i-6] && list[i-8]){
					System.out.println(i);
					break;
				}
				//debug
				//System.out.println(i);
			}
			//System.out.println(-1);
		}
	}
	
	void AOJ0185(){
		int MAX=1000001;
		boolean[] list = new boolean[MAX+1];
		Arrays.fill(list, true);
		list[1]=false;
		for(int i=2; i<=MAX; i++) {
			if(list[i]) {
				for (int j=i+i; j<+MAX; j+=i)	list[j] = false;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)	break;
			int count=0;
			for(int i=1; i<=n/2; i++){
				if(list[i] && list[n-i]){
					count++;
				}
			}
			System.out.println(count);
		}
	}
	
	void AOJ0056(){
		int MAX=100000;
		boolean[] list = new boolean[MAX+1];
		Arrays.fill(list, true);
		list[1]=false;
		for(int i=2; i<=MAX; i++) {
			if(list[i]) {
				for (int j=i+i; j<+MAX; j+=i)	list[j] = false;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)	break;
			int count=0;
			for(int i=1; i<=n/2; i++){
				//System.out.println("I"+i+" N-I"+(n-i));
				if(list[i] && list[n-i]){
					//System.out.println("I"+i+" N-I"+(n-i));
					count++;
				}
			}
			System.out.println(count);
		}
	}
	
	void Old2AOJ0056(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)	break;
			int count=0;
			for(int i=1; i<=n/2; i++){
				if(isPrime(i)&&isPrime(n-i))	count++;
			}
			System.out.println(count);
		}
	}
	
	void OldAOJ0056(){
		
		int MAX=100000;
		boolean[] list = new boolean[MAX+1];
		Arrays.fill(list, true);
		int[] prime = new int[MAX];
		int c=0;
		for(int i=2; i<=MAX; i++) {
			if(list[i]) {
				prime[c]=i;
				c++;
				for (int j=i+i; j<+MAX; j+=i)	list[j] = false;
			}
		}
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)	break;
			int count=0;
			for(int i=0; i<n; i++){
				if(prime[i]>n)	break;
				for(int j=i; j<n; j++){
					int sum = prime[i]+prime[j];
					if(sum > n)	break;
					if(sum == n)	count++;
				}
			}
			System.out.println(count);
		}
	}
	
	void AOJ0150(){
		int MAX=10000;
		boolean[] list = new boolean[MAX+1];
		Arrays.fill(list, true);
		boolean[] flag = new boolean[MAX+1];
		Arrays.fill(flag, false);
		int last = -1;
		for(int i=2; i<=MAX; i++){
			if(list[i]){
				if(i-last == 2)	flag[i]=true;
				last=i;
				for(int j=i+i; j<=MAX; j+=i)	list[j]=false;
			}
		}
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)	break;
			for(int i=n; i>0; i--){
				if(flag[i]){
					System.out.println(i-2+" "+i);
					break;
				}
			}
			//debug
			//System.out.println(-1);
		}
	}
	
	void AOJ0053(){
		int MAX = 10000000;
		boolean[] list = new boolean[MAX+1];
		Arrays.fill(list, true);
		int count=1;
		long[] sum = new long[10001];
		sum[0]=0;
		for(int i=2; i<=MAX; i++){
			if(list[i]){
				sum[count] = sum[count-1]+(long)i;
				count++;
				for(int j=i+i; j<=MAX; j+=i)	list[j]=false;
			}
			if(count>10000) break;
		}
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)	System.exit(0);
			System.out.println(sum[n]);
		}
	}
	
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
	
	boolean[] Sieve2(int MAX){
		boolean[] list = new boolean[MAX+1];
		Arrays.fill(list, true);
		list[1]=false;
		for(int i=2; i<=MAX; i++) {
			if(list[i]) {
				for (int j=i+i; j<+MAX; j+=i)	list[j] = false;
			}
		}
		return list;
	}

	
	boolean isPrime(int n){
		for(int i=2; i*i<=n; i++){
			if(n%i==0)	return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new Main().AOJ0222();
	}

}