import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int min = 1;
		int max = n+1;
		
		for(int i = 0; i < m;i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			
			min = Math.max(l, min);
			max = Math.min(r, max);
		}
		
		int size = Math.max(0, max-min+1);
		
		
		System.out.println(size);
	}
}
