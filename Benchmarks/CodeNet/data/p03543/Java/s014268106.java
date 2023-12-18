
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line = br.readLine();
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		

		if(a/10%111==0)
			System.out.println("Yes");
		else if((a-a/1000*1000)%111==0)
			System.out.println("Yes");
		else
			System.out.println("No");


	}
}
