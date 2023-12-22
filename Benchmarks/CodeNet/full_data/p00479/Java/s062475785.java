import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i = 0; i < k; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int min = a-1;
			min = Math.min(min, b-1);
			
			min = Math.min(min, n - a);
			min = Math.min(min, n - b);
			
			System.out.println((min % 3)+1);
			
		}
		
		
		
	}

	
	
}