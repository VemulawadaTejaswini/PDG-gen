import java.util.Scanner;

public class Main {

	public void main() {

		Scanner sc = new Scanner(System.in);
		String strx = sc.nextLine();
		String stry = sc.nextLine();
		//String[] array = str.split(",");
		int x=0,y=0;


		if(strx.equals("A")) {
			x = 10;
		}
		if(strx.equals("B")) {
			x = 11;
		}
		if(strx.equals("C")) {
			x = 12;
		}
		if(strx.equals("D")) {
			x = 13;
		}
		if(strx.equals("E")) {
			x = 14;
		}
		if(strx.equals("F")) {
			x = 15;
		}


		if(stry.equals("A")) {
			y = 10;
		}
		if(stry.equals("B")) {
			 y = 11;
		}
		if(stry.equals("C")) {
			y = 12;
		}
		if(stry.equals("D")) {
			 y = 13;
		}
		if(stry.equals("E")) {
			 y = 14;
		}
		if(stry.equals("F")) {
			 y = 15;
		}
		if(x<y) {
			System.out.print("<");
		}
		if(x>y) {
			System.out.print(">");
		}
		else {
			System.out.print("=");
		}
	}
}
