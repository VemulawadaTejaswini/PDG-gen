import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		
		if(n%f(n) == 0) System.out.println("Yes");
		else System.out.println("No");
	}
	
	int f(long n) {
		String s = n+"";
		String ss[] = s.split("");
		int m = 0;
		for(int i=0; i<ss.length; i++) {
			m += Integer.parseInt(ss[i]);
		}
		return m;
	}
}