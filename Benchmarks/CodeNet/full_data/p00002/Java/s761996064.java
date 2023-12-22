import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(scan.hasNextInt()){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int sum = a + b;

			System.out.println(sum.toString().length());
		}
	}
}