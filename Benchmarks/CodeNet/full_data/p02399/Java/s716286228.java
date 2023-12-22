import java.util.Scanner;

public class Main {
    public static void main(String args[]){
	Scanner in= new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	int d = 0;
	int r = 0;
	double f = 0;
	System.out.printf("%d %d%n", a, b);
	d = a / b;
	r = a % b;
	f = (double)a / b;
	System.out.printf("%d %d %.8f", a, b, f);
    }   
}