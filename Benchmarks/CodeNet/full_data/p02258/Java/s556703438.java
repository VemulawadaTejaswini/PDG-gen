
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int[] r = new int[n];
	    for (int i = 0; i < n; i++) {
			r[i] = scan.nextInt();
		}
	    
		//int[] r = {5, 3, 1, 3, 4, 3};
		//int[] r = {4, 3, 2};
	    
		int margin = -1;
		for (int i = 0; i < r.length; i++) {
			for (int j = i +1; j < r.length; j++) {
				margin = Math.max(margin, r[j]-r[i]);
			}
		}
		
		System.out.println(margin);
	}
}