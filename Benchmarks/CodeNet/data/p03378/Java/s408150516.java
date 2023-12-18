

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt()+1;
		int m = scanner.nextInt();
		int x = scanner.nextInt();
		
		boolean[] gate = new boolean[n];
		Arrays.fill(gate, false);
		
		for (int i = 0; i < m; i++) {
			int g = scanner.nextInt();
			gate[g] = true;
		}
		
		int rgoal = 0;
		int lgoal = 0;
		
		
		for (int i = x; i < gate.length; i++) {
			if (gate[i]) {
				rgoal++;
			}
		}
		
		for (int i = x; i > 0; i--) {
			if (gate[i]) {
				lgoal++;
			}
		}
		
		int anser = lgoal;
		
		if (rgoal<lgoal) {
			anser = rgoal;
		}
		
		System.out.println(anser);
		scanner.close();
	}
	
	

}
