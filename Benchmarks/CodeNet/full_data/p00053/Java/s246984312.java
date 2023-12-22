import java.util.*;

//
class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		LinkedList<Integer> primes=new LinkedList<Integer>();
		for(int i=2;i<1000000;i++){
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

		while(true){
			int n=sc.nextInt();
			if(n==0)break;

			int sum=0;
			for(int i=0;i<n;i++){
				sum+=primes.get(i);
			}
			ln(sum);
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