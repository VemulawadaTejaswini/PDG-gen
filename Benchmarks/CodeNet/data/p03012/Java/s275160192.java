import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();			
			Integer w[] = new Integer[n];
			
			int s1 = 0;
			int s2 = 0;
			
			for (int i = 0; i < n; i++) {
				w[i] = sc.nextInt();
				s1 += w[i];
			}
			
			int result = 10000;
			int temp = 0;
			for (int i = n - 1; i > 0; i--) {
				s1 -= w[i];
				s2 += w[i];
				temp = Math.abs(s1-s2);
				if (temp < result) {
					result = temp;
				}
			}
			
			System.out.println(result);
			
		}

	}

}
