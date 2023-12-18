
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int H=scn.nextInt();
		int W=scn.nextInt();
		int h=scn.nextInt();
		int w=scn.nextInt();
		System.out.println(H*W+h*w-H*w-W*h);
	}

}
