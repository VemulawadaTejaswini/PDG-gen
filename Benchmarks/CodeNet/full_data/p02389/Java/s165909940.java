import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int a =scan.nextInt();
		int b = scan.nextInt();

		if(1 <= a){
			if(b <= 100){
				System.out.println(a * b);
			}
		}
	}
}