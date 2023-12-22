import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int number = 0;
		int max = 0;
		int min = 0;
		int sum = 0;
		
		for(int i=0;  i<n; i++) {
			number = sc.nextInt();
			
			sum = sum + number;
			
			if (number > max) max = number;
			if (number < min) min = number;
		}		
		
		System.out.println(min);
		System.out.println(max);
		System.out.println(sum);
	}
}
