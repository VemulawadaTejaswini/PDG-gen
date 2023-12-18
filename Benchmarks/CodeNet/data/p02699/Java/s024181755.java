package Sample;
import java.util.Scanner;

public class Sheepand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("S ");

		System.out.print("W");
		int s = sc.nextInt();
		int w = sc.nextInt();
		
		if(s > w) {
			System.out.println("safe");
		}else {
			System.out.println("unsafe");
		}
		
		

	}

}
