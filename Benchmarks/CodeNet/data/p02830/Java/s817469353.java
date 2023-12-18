import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		char [] s = stdIn.next().toCharArray();
		char [] t = stdIn.next().toCharArray();
		
		for(int i = 0; i < n; i++) {
			System.out.print(s[i]);
			System.out.print(t[i]);
		}
		
		
		
	}

}
