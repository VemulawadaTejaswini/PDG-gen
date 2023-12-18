import java.util.Scanner;

public class  Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
				
		for(int i = 1; i < Integer.MAX_VALUE; i++) {
			if(Math.abs(a-i) == Math.abs(b-i)) {
				System.out.println(i);
			}
		}
		System.out.println("IMPOSSIBLE");
		
		
		
	}

}
