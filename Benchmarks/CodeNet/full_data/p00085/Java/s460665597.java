import java.util.Scanner;

public class Main {
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String[] nico = sc.nextLine().split(" ");
			int n = Integer.parseInt(nico[0]);
			int m = Integer.parseInt(nico[0]);
			
			int[] num = new int[n];
			for (int i = 0; i < n; i++) {
				num[i] = 0;
			}
			
			int cnt = 0;
			while (cnt < n) {
				for (int i = 0; i < n; i++) {
					if (num[i] != 0) continue;
					m++;
					
					if (m == 9) {
						cnt++;
						num[i] = cnt;
						
						if (cnt == n) System.out.println(i + 1);
						
						m = 0;
					}
				}
			}
		}
	}
}