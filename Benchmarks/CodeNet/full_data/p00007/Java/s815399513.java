
import java.util.Scanner;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int count=sc.nextInt();
		long money=100000;
		while(count--!=0){
			money*=1.05;
			if(money%1000!=0)money+=1000;
			money-=money%1000;
		}
		ln(money);
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