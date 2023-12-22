
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num_values = in.nextInt();
		int[] values = new int[num_values];
		for(int i = 0; i < num_values; i++) {
			values[i] = in.nextInt();
		}
		in.close();
		int maxp = values[1] - values[0];
		int minv = min(values[1], values[0]);
		for(int i = 2; i < num_values; i++) {
			// maxp = values[i] - minv;
			maxp = max(maxp, values[i] - minv);
			minv = min(minv, values[i]);
		}
		System.out.println(maxp);
	}
	
	public static int max(int x, int y) {
		if(x > y)
			return x;
		else return y;
	}
	
	public static int min(int x, int y) {
		if(x > y)
			return y;
		else return x;
	}
	
}
