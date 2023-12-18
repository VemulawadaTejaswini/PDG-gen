import java.util.Scanner;

public class C {
	
	public static int absDifference(int x, int[] cards) {
		int sumx = 0;
		int sumy = 0;
		int n = cards.length;
		
		for (int i = 0; i < x; i++) {
			sumx += cards[i];
		}
		
		for (int i = 0; i < n-x; i++) {
			sumy += cards[n-i-1];
		}
		
		return Math.abs(sumx - sumy);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] cards = new int[n];
		
		for (int i = 0; i < n; i++) {
			cards[i] = sc.nextInt();
		}
		
		sc.close();
		
		int ans = 100000000;
		
		for (int i = 1; i < n; i++) {
			int temp = absDifference(i, cards);
			if (temp <= ans) {
				ans = temp; 
			}
		}
		
		System.out.println(ans);
		
		
	}
	
}