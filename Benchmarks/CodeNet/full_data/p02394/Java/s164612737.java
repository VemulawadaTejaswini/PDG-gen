import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int W = s.nextInt();
		int H = s.nextInt();
		int x = s.nextInt();
		int y = s.nextInt();
		int r = s.nextInt();
		s.close();

		if(x-r >= 0 && x+r <= W && y-r >= 0 && y+r <= H){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}