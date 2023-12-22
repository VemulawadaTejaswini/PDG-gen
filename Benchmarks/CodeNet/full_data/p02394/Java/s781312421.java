import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int W = in.nextInt();
		int H = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int r = in.nextInt();
		if(x + r > W || x - r < 0){
			System.out.println("No");
		}else if(y + r > H || y - r < 0){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}