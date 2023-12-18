
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt() , y = sc.nextInt(), z = sc.nextInt();
		int temp = x ;
		x = y ;
		y = temp ;
		int temp2 = x;
		x = z ;
		z =temp2;
		System.out.println(x+" "+y+" "+z);
				
	}

}
