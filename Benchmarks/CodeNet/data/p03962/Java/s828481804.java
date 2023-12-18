
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//	String line = br.readLine();

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int ct=0;
		
		if(a==b && b==c)
		ct=1;
		else if(a==b || b==c || a==c)
			ct=2;
		else
			ct=3;
			System.out.println(ct);
		
}
}