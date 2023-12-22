
import java.util.Scanner;

class Main {
	Scanner sc = new Scanner(System.in);

	public long gcd(long a,long b){
		return b==0?a:gcd(b,a%b);
	}
	
	public void run() {
		while(sc.hasNext()){
			long a=sc.nextInt(),b=sc.nextInt();
			long g=gcd(a,b);
			ln(g+" "+ a*b/g);
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