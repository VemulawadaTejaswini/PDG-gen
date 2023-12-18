import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x[] = new int[n];
		for (int i=0; i<n; i++){
			x[i] = sc.nextInt();
		}
		for (int i=0; i<n; i++){
			int x2[] = new int[n-1];
			int x2idx = 0;
			for (int j=0; j<n; j++){
				if (i != j){
					x2[x2idx] = x[j];
					x2idx++;
				}
			}
			Arrays.sort(x2);
			int median = x2[((n+1)/2 )-1];
			System.out.println(median);
		}
	}
}
