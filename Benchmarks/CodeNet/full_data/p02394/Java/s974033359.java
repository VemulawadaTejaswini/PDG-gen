import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		int h = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int r = in.nextInt();
		
		if((x+r<=w)&&(x-r>=0)&&(y+r<=h)&&(y-r>=0)) System.out.println("Yes");
		else System.out.println("No");
	}

}