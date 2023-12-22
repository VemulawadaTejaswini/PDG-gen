
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			int n, cnt;
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			for(cnt = 3; cnt < n; cnt++){
				if(cnt % 3 == 0 || String.valueOf(cnt).contains("3"))
					System.out.print(" " + cnt);
			}
			
			if(n % 3 == 0)
				System.out.println(" " + n);
			else
				System.out.print("\n");
	}
}