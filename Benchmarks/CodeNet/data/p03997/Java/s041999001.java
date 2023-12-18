import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// get a integer
		int a = sc.nextInt();
		// get two integers separated with half-width break
		int b = sc.nextInt();
		int c = sc.nextInt();
		// get a string
		//String s = sc.next();
		// output
		double res = (a+b)*c;
		res = res / 2;
		System.out.println(res);
	}
	
}