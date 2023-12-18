import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			int x, a;
			x = sc.nextInt();
			a = sc.nextInt();
			
			if (x <a) System.out.println("0");
			else System.out.println("10");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
