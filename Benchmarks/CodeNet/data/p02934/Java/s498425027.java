import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numN = s.nextInt();
		int[] integers = new int[numN];
		double[] dous = new double[numN];
		double sum = 0;
		for(int i = 0; i < numN ; i++) {
			integers[i] = s.nextInt();
			dous[i] = 1 / integers[i];
			sum += dous[i];
		}
		
		double ans = 1 / sum;
		System.out.println(ans);


	}

}