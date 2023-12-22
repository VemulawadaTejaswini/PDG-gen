import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in); 
		int x, y;
		
		for(int i = 1; i <= 10000; i++){
			x = scan.nextInt();
			y = scan.nextInt();
			
			if(x == 0 && y == 0){
				break;
			}
			
			if(x > y){
				int a;
				a = x;
				x = y;
				y = a;
			}
			
			System.out.println(x + " " + y);
		}
	
	}

}