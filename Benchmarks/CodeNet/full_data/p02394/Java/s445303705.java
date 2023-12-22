import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		//????????¶??\???
		if(x -r >= 0 && x + r <= W &&  x + r <= H){
			System.out.println("Yes");
		}
		
		if (x - r > 0 || x + r > W || x + r > H){
			System.out.println("No");
		}
	}
}