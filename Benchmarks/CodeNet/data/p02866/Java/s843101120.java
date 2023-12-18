import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			
			if ((i == 0 && num != 0) || (0 < i && i < n - 1 && num == 0)) {
				System.out.println(0);
				sc.close();
				return;
			}
			
			d[num]++;
		}
		
		int cnt = 1;
		for (int i = 1; i < n - 1; i++) {
			cnt *= (int) Math.pow(d[i - 1], d[i]);
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}

