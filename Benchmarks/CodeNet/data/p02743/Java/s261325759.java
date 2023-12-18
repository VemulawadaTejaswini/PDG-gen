import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			double a = Integer.parseInt(sc.next());
			double b = Integer.parseInt(sc.next());
			double c = Integer.parseInt(sc.next());
			double A = Math.sqrt(a);
			double B = Math.sqrt(b);
			double C = Math.sqrt(c);
			if(A+B<C) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}	
	}
}