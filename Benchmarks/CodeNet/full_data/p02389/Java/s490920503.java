import java.util.Scanner;

class Main{

		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			int x = scan.nextInt();
			int y = scan.nextInt();
			int xy = x*2+y*2;
			System.out.println(x*y + " " + xy);
	}
}