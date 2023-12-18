import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
	      int A,B,T;
	      A = sc.nextInt();
	      B = sc.nextInt();
	      T = sc.nextInt();
	      
	      System.out.println((T+0.5/A)*B);
	}

}