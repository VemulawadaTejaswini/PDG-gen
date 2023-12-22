import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdn = new Scanner(System.in);
		int W = stdn.nextInt();
		int H = stdn.nextInt();
		int x = stdn.nextInt();
		int y = stdn.nextInt();
		int r = stdn.nextInt();
		
		
		if(x - r > 0 && x + r < W){
			if(y - r > 0 && y + r < H){
				System.out.println("Yes");
			}
		}else{
			System.out.println("No");
		}
	}
}