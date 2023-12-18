import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();

	    double ans = (double)n/1.08;

	    if((int)ans == ans ) System.out.println((int)ans);
	    else System.out.println(":(");

	}

}