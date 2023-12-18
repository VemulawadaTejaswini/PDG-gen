import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int H = scn.nextInt();
		int W = scn.nextInt();
		int h = scn.nextInt();
		int w = scn.nextInt();
		System.out.println(H*W-(h*W+H*w-h*w));
		scn.close();
	}
}