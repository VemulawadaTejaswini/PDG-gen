import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(true){
			double q=sc.nextDouble();
			double x=Math.abs(q/2);
			if(q==-1)break;

			while(Math.abs(x*x*x-q)>=0.00001*q){
				x=x-(x*x*x-q)/(3*x*x);
			}
			ln(String.format("%.8f",x));
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