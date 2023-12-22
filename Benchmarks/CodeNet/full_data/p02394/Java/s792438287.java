import java.util.Scanner;

public class Main {
	
	public void exec() {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		System.out.println((r<=x && x<=W-r && r<=y && y<=H-r)?"Yes":"No");
		sc.close();
	}
	public static void main(String[] args)  {
		new Main().exec();
	}
}