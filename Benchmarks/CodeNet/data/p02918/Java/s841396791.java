import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int n = sc.nextInt();
		int k  =sc.nextInt();
		char prev = ' ';
		int init = 0;
		for(char ch : sc.next().toCharArray()) {
			if(ch == prev) {
				init++;
			}
			prev = ch;
		}
		
		System.out.println(Math.min(n-1, init+2*k));
		
	}
}
