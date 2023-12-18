import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		int[] count = new int[4];
		for(int i=0; i<6; i++) {
			int a = Integer.parseInt(sc.next());
			count[--a]++;
			if(count[a] >= 3) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
