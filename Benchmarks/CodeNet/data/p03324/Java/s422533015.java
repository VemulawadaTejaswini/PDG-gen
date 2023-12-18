import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		sc.close();

		int res = 0;
		for(int i=1;;i++) {
			if(calc(i) == d) {
				res++;
				if(res == n) {
					System.out.println(i);
					return;
				}
			}
		}
		
	}
	
	int calc(int x) {
		if(x%100 != 0) return 0;
		else return calc(x/100) + 1;
	}
}