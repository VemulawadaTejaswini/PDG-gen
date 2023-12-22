import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		long d = a/b;
		long r = a%b;
		double f = 1.0 * a / b;
		System.out.println(d+" "+r+" "+f);
	}
}