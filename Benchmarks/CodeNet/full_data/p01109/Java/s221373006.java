import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int n = scan.nextInt();
			if(n == 0) break;
			int[] incomes = new int[n];
			int sum = 0;
			for(int i = 0; i < n; i++) {
				incomes[i] = scan.nextInt();
				sum += incomes[i];
			}
			int sumBar = sum / n;
			int count = 0;
			for(int i = 0; i < n; i++) {
				if(sumBar >= incomes[i] ) count++;
			}
			System.out.println(count);
		}
		scan.close();
	}
}
