import java.util.Scanner;
public class Main {
	  static int[] a;
	  static int num;

	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  int n = sc.nextInt();
		  int mae = sc.nextInt();
		  System.out.print(n-mae+1);
		  
		  sc.close();
	  }
}