import java.util.*;

public class Main {
	static Scanner s = new Scanner(System.in);
	public static void main(String args[]){
		while(true){
			int a = s.nextInt();
			int b = s.nextInt();
			double A = (double) a;
			double B = (double) b;
			double x = A / B;
			System.out.println(a/b+" "+a%b+" "+x);
		}
	}
}