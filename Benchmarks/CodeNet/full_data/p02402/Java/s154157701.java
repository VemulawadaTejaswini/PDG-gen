import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for (int i=0;i<count;i++){
			int t = scanner.nextInt();
			if (t < min) {
				min = t;
			}
			if (t > max) {
				max = t;
			}
			sum = sum + t;
		}
		
		System.out.println(""+ min + " " + max + " " + sum);
		
	}

}