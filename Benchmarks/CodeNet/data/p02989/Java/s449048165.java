import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 int N = scan.nextInt();
		 int d[] = new int[N];
		 
		 for (int i = 0; i < N; i++) {
			 d[i] = scan.nextInt();
		 }
		 
		 Arrays.sort(d);
		 
		 int K = d[N / 2] - d[N / 2 - 1];
		 
		System.out.println(K);
		 scan.close();

	}

}
