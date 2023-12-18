import java.util.*;
import java.io.*;
public class wow {
	public static void main(String args[]) throws Exception {
		Scanner scan = new Scanner(System.in);
		int balls = scan.nextInt();
		int[] values = new int[balls];
		int max = 0;
		for (int i = 0; i < balls; i++) {
			values[i] = scan.nextInt();
			if (values[i] > max) max = values[i];
		}

		int[] combos = new int[max];
		for (int k = 0; k < balls; k++) {
			combos[values[k] - 1]++;
		}		
		for (int i = 0; i < balls; i++) {
			int sum = 0;
			combos[values[i] - 1]--;
			for (int k = 0; k < combos.length; k++) {
				if (combos[k] != 0)	
                sum += (combos[k] * (combos[k] - 1)) / 2;
			}
			combos[values[i] - 1]++;
			System.out.println(sum);
		}
	}
}
