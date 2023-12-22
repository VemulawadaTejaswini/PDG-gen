import java.util.Scanner;

public class ITP1_4A {
    public static void Main (String args[]){
	Scanner in= new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();

	int d = a / b;
	int r = a % b;
	double f = (double)a / b;

	System.out.printf("%d %d %.8f", d, r, f);
    }   
}