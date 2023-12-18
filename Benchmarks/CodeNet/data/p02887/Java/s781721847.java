import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {

			int n = scan.nextInt();
			
			int ans = 0;
			
			String cur = scan.next();
			
			String[] a = cur.split("");
			
			String preCol = "";
			for(String c:a) {
				
				if(!preCol.equals(c)) {
					ans++;
				}
				
				preCol = c;
			}
			
			System.out.println(ans);
		}
	}
}