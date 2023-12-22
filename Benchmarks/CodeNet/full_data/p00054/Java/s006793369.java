import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(sc.hasNext()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int n=sc.nextInt();
			int sum=0;
			for(int i=0;i<n;i++){
				a*=10;
				sum+=(a/b)%10;
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