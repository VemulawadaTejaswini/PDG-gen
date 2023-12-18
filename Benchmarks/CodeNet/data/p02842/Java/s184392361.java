import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		double a = n/1.08;
		System.out.println(Math.floor(a*1.08));
		int x = (int)a;
		int c = (int)Math.floor(a*1.08);
		System.out.println(c);
		
		if(c!= n  ) {
			System.out.println(":(");
		}else {
			if(c == n) {
				System.out.println(x);
			}
			
			
		}
		
		
	}

}
