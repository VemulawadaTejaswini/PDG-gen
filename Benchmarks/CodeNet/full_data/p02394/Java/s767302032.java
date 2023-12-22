import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);

		int W = ac.nextInt();
		int H = ac.nextInt();
		int x = ac.nextInt();
		int y = ac.nextInt();
		int r = ac.nextInt();
		
		if ((x - r) < 0 || W < ( x + r)){
			System.out.println("No");
		}else if ((y - r) < 0 || H < ( y + r)){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}

}

