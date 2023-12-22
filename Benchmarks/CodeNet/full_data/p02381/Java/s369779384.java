import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		while(true) { 
			n = scan.nextInt();
			int[] num = new int[n];
			double average = 0;
			double dispersion = 0;
			for (int i = 0; i < n; i++) {
				num[i] = scan.nextInt();
				average += num[i];
			}
			average = average / n;
			for (int i = 0; i < n; i++) {
				dispersion += Math.pow((num[i] - average), 2);
			}
			
			System.out.println(Math.sqrt(dispersion / n));
			if (n == 0) break;
		}
	}

}