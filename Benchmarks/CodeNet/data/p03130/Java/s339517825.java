import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in) ;
	public static void main(String[]args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int c[] = new int[5];
		
		for(int i = 0 ; i < 6 ; i++) {
			c[sc.nextInt()]++;
		}
		
		boolean flag = false;
		for(int cc : c) {
			flag = flag || (cc == 3);
		}
		
		if(flag) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
		
	}
}