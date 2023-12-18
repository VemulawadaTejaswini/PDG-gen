
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		if(a>=13)
		System.out.println(b);
		else {
			if(a>5)
			System.out.println(b/2);
			else {
				System.out.println(0);
			}
		}
	}

}
