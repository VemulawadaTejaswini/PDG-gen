import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		
		int sxl = x - r;
		int sxr = x + r;
		int syu = y + r;
		int syd = y - r;
		
		if(sxl < 0 || sxr > W || syu > H || syd < 0){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
	}
}