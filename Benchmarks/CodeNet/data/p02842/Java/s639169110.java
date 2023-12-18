import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	public void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int upper = (n + 1)* 100 / 108;
		int lower = n * 100 / 108;
		
		for(int i = lower; i <= upper; i++) {
			int zeikomi = i * 108 / 100;
			if(zeikomi == n) {
				System.out.println(i);
				return;
			}
		}
		
		System.out.println(":(");
	}
}
