
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int x=scan.nextInt();
		if(a>x) {
			System.out.println("No");
		}
		else if((x-a)>b){
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
	}
}