
import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		LinkedList<Integer> primes=new LinkedList<Integer>();
		
		for(int i=2;i<=100000;i++){
			boolean isprime=true;
			for(int prime:primes){
				if(i%prime==0){
					isprime=false;
					break;
				}
				if(prime*prime>i){
					break;
				}
			}
			if(isprime){
				primes.add(i);
			}
		}
		while(sc.hasNext()){
			int n=sc.nextInt();
			
			int c=0;
			for(int prime:primes){
				if(prime<=n){
					c++;
				}else{
					break;
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