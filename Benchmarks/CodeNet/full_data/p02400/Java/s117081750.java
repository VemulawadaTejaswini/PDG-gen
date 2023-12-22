import java.util.Scanner;
import static java.lang.Math.PI;
class Main {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();	
		System.out.println(x*x*Math.PI+" "+2*x*Math.PI);
	}
}