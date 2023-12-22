import java.util.*;
import java.lang.*;
import java.math.*;

class Main {

	Scanner sc = new Scanner(System.in);

	void run() {
		
		int[] mt = new int [10];
		
		for (int i = 0; i < 10; i++) {
			mt[i] = sc.nextInt();
		}
		
		Arrays.sort(mt);
		
		System.out.println(mt[9] + "\n" + mt[8] + "\n" + mt[7] );
		

	}

	public static void main(String[] args) {
		new Main().run();
	}
}