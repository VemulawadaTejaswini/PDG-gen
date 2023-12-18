import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0;
		for(int i=0; i<n; i++) {
			res += f(sc.nextLong());
		}
		sc.close();
		System.out.println(res);
	}
	
	int f(long a) {
		if(a%2 != 0) return 0;
		else return f(a/2) + 1;
	}
}