import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		char[]n = stdIn.next().toCharArray();
		if(n[0]=='7'||n[1]=='7'||n[2]=='7') {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}

}
