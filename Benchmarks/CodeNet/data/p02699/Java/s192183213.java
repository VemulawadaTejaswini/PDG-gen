import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		int W = scan.nextInt();
		String result = "unsafe";
		if(S>W) {
			result="safe";
		}
		scan.close();
		System.out.println(result);
	}
}