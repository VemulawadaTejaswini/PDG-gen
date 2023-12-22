import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		
		for(int i = 0; i < N; i++){
			final int X = sc.nextInt();
			final int Y = sc.nextInt();
			final int W = sc.nextInt();
			final int H = sc.nextInt();
			
			if(X == 0 && Y == 0 && W == 0 && H == 0){
				break;
			}
			
			final int X2 = X + W;
			final int Y2 = Y + H;
			
			final int n = sc.nextInt();
			
			int count = 0;
			
			for(int j = 0; j < n; j++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				if(X <= x && x <= X2 && Y <= y && y <= Y2){
					count++;
				}
			}
			
			System.out.println(count);
		}
		
	}
}	