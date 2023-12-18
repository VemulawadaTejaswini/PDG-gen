import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int k = stdIn.nextInt();
		
		String dec = Integer.toString(n,k);
		
		System.out.println(dec.length());
	}

}
