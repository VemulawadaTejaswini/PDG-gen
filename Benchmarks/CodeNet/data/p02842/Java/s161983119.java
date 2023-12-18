import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		double left = n/1.08;
		double right = (n+1)/1.08;
		
		int x = (int)Math.ceil(left);
		if(x < right) {
			System.out.println(x);
		}else {
			System.out.println(":(");
		}
		
		
	}

}
