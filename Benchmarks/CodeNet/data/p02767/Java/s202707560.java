import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static int pow2(int n) {
		return n*n;
	}
	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int n = sca.nextInt();
	int[] xi = new int[n];
	for(int i = 0; i < n; i++) {
		xi[i] = sca.nextInt();
	}

	Arrays.sort(xi);
	int start = xi[0];
	int end = xi[n-1];
	int min = 1000000;
	int loop = 0;

	for(int i = start; i <= end; i++) {
		loop = 0;
		for(int j = 0; j < n; j++) {
			loop += pow2(xi[j] - i);
		}
		if(min > loop) {
			min = loop;
		}
	}
	System.out.println(min);

	// 後始末
	sca.close();
	}
}