import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		HashSet<Integer> primes=new HashSet<Integer>();
		for(int i=2;i<=50000;i++){
			boolean isprime=true;
			for(int prime:primes){
				if(i%prime==0){
					isprime=false;
					break;
				}
				if( prime*prime>i){
					break;
				}
			}
			if(isprime){
				primes.add(i);
			}
		}
		boolean[] hash=new boolean[50001];
		for(int prime:primes){
			hash[prime]=true;
		}

		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)break;

			int c=0;
			for(int a=1;a<=n/2;a++){
				int b=n-a;
				if(hash[a] && hash[b]){
					c++;
				}
			}
			ln(c);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}