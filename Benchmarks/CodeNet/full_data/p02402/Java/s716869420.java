import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n, a, min, max;
		long sum;
		   
		n = scan.nextInt();

		a = scan.nextInt();
		sum = min = max = a;
		for(int i = 1; i < n; i++){
			a = scan.nextInt();

			if(a < min)
				min = a;
			else if(a > max)
				max = a;
			sum += a;
		}
		System.out.println(String.format("%d %d %d", min, max, sum));
	}
}

