import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		int max = 0;
		for (int i = 0; i < 2; i++) {
			int temp = 0;
			for (int j = 0; j < 4; j++) {
				temp += sc.nextInt();
			}
			max = Math.max(temp,max);
		}
		System.out.println(max);
		
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}