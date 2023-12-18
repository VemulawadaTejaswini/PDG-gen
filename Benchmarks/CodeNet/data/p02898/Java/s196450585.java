import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int[] h = new int[n];

int cnt =  0;
		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(sc.next());
			if(h[i] >= k) {
				cnt++;
			}
		}


		
		System.out.println(cnt);
		sc.close();
	}
}