import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		String answer = "No";

		if(a < b){
			if(b < c){
				answer ="Yes";
			}
		}
		System.out.println(answer);
		scan.close();
	}
}