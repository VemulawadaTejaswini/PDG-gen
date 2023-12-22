import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int k = 0;
		int sum = 0;
		
		do {
			sum += x;
			k++;
		}
		while (sum % 360 != 0);
		
		System.out.println(k);
		
		sc.close();
	}
}


