import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		int pop = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] >= sum/(4*m)) {
				pop++;
				if(pop >= m) {
					break;
				}
			}
		}
		if(pop >= m) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
}
