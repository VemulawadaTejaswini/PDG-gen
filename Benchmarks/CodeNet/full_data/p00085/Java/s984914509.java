import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public int josephus(int n,int m,int k){
		return ((k<=1)?(m-1):(josephus(n-1,m,k-1)+m))%n;
	}

	public void run() {
		while(true){
			int n=sc.nextInt();
			int m=sc.nextInt();
			if(n==0 && m==0)break;
			ln(josephus(n,m,n)+1);
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