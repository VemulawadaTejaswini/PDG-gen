import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		char[]a = stdIn.next().toCharArray();
		char[]b = stdIn.next().toCharArray();
		
		
		char[] c = new char[a.length];
		
		for(int i = 0; i < a.length; i++) {
			c[i] = a[a.length-i-1];
		}
		/*System.out.println(b);
		System.out.println(c);
		*/
		
		for(int i = 0; i < 3; i++) {
			if(c[i]!=b[i]) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		
	}

}
