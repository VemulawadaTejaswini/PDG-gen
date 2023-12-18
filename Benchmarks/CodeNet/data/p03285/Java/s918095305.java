import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean isTrue = false;
		
		if (n % 7 == 0)
			isTrue = true;
		if (n % 4 == 0)
			isTrue = true;
		
		int total;
		while(!isTrue && n >= 4) {
			for (int i = 0; i*7 < n; i++) {
				for (int j = 0; j < 10; j++) {
					total = 7 * i + 4 * j;
					if (total == n)
						isTrue = true;
					if (total > n)
						break;
				}
			}
		}
		System.out.println(isTrue ? "Yes" : "No");
	}
}