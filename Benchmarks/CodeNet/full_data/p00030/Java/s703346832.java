import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	private int pat;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine() == true) {
			String str = sc.nextLine();
			if (str.equals("0 0")) break;
			
			String[] params = str.split(" ");
			int num = Integer.parseInt(params[0]);
			int sum = Integer.parseInt(params[1]);
			
			pat = 0;
			for (int i = 0; i < sum; i++) {
				calc(i, 0, (num - 1), sum);
			}
			
			System.out.println(pat);
		}
	}
	
	public void calc(int d, int t, int n, int s) {
		int tsum = d + t;
		if (tsum > s) return;
		
		if (tsum == s) {
			if (n == 0) pat++;
			else return;
		}
		
		for (int i = (d + 1); i < s; i++) {
			calc(i, 0, (n - 1), s);
		}
	}
}