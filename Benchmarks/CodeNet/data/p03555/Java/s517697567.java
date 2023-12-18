
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line = br.readLine();
		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		String b = scan.next();
		
		StringBuffer sb = new StringBuffer(b);
		String c = sb.reverse().toString();

		if(a.equals(c))
			System.out.println("YES");
		else
			System.out.println("NO");
		

	}
}
