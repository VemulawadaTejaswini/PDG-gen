import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		Long h = Long.parseLong(sc.next());
		Long w = Long.parseLong(sc.next());
		
		long ans = h* w /2;
		ans += (h*w)%2;
				
				
		System.out.println(ans);
		
		}
}