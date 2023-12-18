import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int x = scan.nextInt();
			int y = scan.nextInt();





			if(x>=0) {

				int Y = Math.abs(y);
				if(x<=Y) {
					if(y>0)System.out.println(y-x);
					else System.out.println(-y-x+1);
				}else {
					System.out.println(y-(-x)+1);
				}

			}else {
				int Y = Math.abs(y);
				if(x<=Y) {
					if(y>=0)System.out.println(y-(-x)+1);
					else System.out.println(-y-(-x)+2);
				}else {
					System.out.println(Math.abs(x-y));
				}


			}


		}


	}


}
