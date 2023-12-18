import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
			
		int c = 1;
		int cnt = 0;
		while(c < b) {
			c += a -1;
			cnt++;
		}
		
		System.out.println(cnt);

	}
}