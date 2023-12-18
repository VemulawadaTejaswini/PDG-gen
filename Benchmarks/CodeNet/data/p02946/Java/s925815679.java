import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int l = x - k +1; l = Math.max(l,-1000000);
		int r = k + x -1; r = Math.min(r,1000000);
		for(int i = l; i <= r; i++ ) {
			System.out.println(i);
		}
	}

}