import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdn = new Scanner(System.in);
		
		int t = 0;
		
		for(int i = 0; i <= 3000; i++){
			int x = stdn.nextInt();
			int y = stdn.nextInt();
			if(x != 0 || y != 0){
				if(x > y){
					t = x;
					x = y;
					y = t;
				}
				System.out.println(x + " " +y);
			} else if(x == 0 && y == 0){
				break;
			}
		}
	}
}