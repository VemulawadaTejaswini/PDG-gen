
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		
		double ans = 0;
		if(d == 0){
			ans = n;
		}else{
			ans = (n-d)*2;
		}
		
		ans = ans*(m-1)/n/n;
		
		System.out.printf("%.10f", ans);
//		System.out.println(ans);
	}
}
