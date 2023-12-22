import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String N = scan.next();
		if(N.equals("ABC")) {
		N="ARC";
		}else {
			N="ABC";
		}
		System.out.println(N);
	}
}