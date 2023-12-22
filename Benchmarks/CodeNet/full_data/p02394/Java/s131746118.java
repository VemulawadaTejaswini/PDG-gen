import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int W = in.nextInt();
		int H = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int r = in.nextInt();
		if(x + (r * r) > W || x - (r * r) < 0){
			System.out.println("No");
		}else if(y + (r * r) > H || y - (r * r) < 0){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}