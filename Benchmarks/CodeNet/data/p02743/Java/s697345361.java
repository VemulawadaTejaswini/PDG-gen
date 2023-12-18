import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		Long a = Long.parseLong(sc.next());
		Long b = Long.parseLong(sc.next());
		Long c = Long.parseLong(sc.next());
		
		String ans = "No";
		
		Long d = a * b;
		Long e = (c - a - b);
		if(e > 0) {
			   e = e * e / 4;
			   if(e % 4 != 0) {
				   e++;
			   }
		}
		
		if(d  < e) {
			ans = "Yes";
		}
		System.out.println(ans);
	}
}