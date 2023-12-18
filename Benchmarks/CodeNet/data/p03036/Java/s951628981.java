import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int r = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		sc.close();
		
		int ans = x;
		for(int i=0; i<10; i++) {
			ans = r*ans - D;
			System.out.println(ans);
		}

	}

}
