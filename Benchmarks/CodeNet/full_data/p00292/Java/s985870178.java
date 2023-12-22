import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new aoj0297().doIt();
	}
	class aoj0297 {
		void doIt() {
			int n  = sc.nextInt();
			for(int i = 0;i < n;i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				if(a % b == 0)System.out.println(b);
				else System.out.println((a % b));
			}
		}
	}
}