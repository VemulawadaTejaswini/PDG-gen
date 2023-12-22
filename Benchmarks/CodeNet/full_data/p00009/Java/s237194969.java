import java.util.Scanner;

public class Main {
	
	void run() {
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			
			int vol = Integer.parseInt(in.next());
			
			int count = 0;
			for (int i = 2; i <= vol; i++) {
				if(check_vol(i)) count++; 
			}
			System.out.println(count);
		}
	}
	
	boolean check_vol(int x) {

		int count = 0; 
		for (int i = 2; i <= x; i++) {
			if(x % i == 0) count++; 
		}
		
		return count == 1 ? true : false;
	}

	public static void main(String[] args) {
		new Main().run();
	}
}