import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		int d = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
		
		StringBuilder sb = new StringBuilder();
		sb.append(n);
		for(int i=0; i<d; i++) {
			sb.append("00");
		}
		System.out.println(sb.toString());
	}
}
