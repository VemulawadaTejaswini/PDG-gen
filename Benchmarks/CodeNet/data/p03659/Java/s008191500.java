import java.util.Scanner;

class Main {
	
	public static int sumCards(int x, int[] cards) {
		int ans = 0;
		for (int i = 0; i < x; i++) {
			ans += cards[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] cards = new int[n];
		
		for (int i = 0; i < n; i++) {
			cards[i] = sc.nextInt();
		}
		
		sc.close();

		int sumcards = 0;
		
		for (int i = 0; i < n; i++) {
			sumcards += cards[i];
		}
		
		int ans = sumcards;
		
		for (int i = 1; i < n; i++) {
			int sumx = sumCards(i, cards);
			int sumy = sumcards - sumx;
			int difference = Math.abs(sumx - sumy);
			if (difference <= ans) {
				ans = difference;
			}
		}
		
		System.out.println(ans);
	}
	
}