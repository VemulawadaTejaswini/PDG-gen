import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();


	public List<Integer> getPrimeList(int max){
		LinkedList<Integer> primes=new LinkedList<Integer>();

		PLoop:for(int i=2;i<max;i++){
			if(i%7==1 || i%7==6){
				for(int prime:primes){
					if(i%prime==0){
						continue PLoop;
					}
					if( prime*prime>i){
						break;
					}
				}
				primes.add(i);
			}
		}
		return primes;
	}

	public void run() {
		List<Integer> plist=getPrimeList(300000);

		while(true){
			int n=sc.nextInt();
			if(n==1)
				break;

			List<Integer> res=new LinkedList<Integer>();
			for(int p:plist){
				if(n%p==0)res.add(p);
			}
			pr(n+":");
			for(int r:res){
				pr(" "+r);
			}
			ln();
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

	public int[] nextIntArray(int n){
		int[] res=new int[n];
		for(int i=0;i<n;i++){
			res[i]=sc.nextInt();
		}
		return res;
	}
	public static void pr(Object o) {
		out.print(o);
	}
	public static void ln(Object o) {
		out.println(o);
	}
	public static void ln() {
		out.println();
	}
}