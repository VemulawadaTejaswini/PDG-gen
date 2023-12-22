import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x, y;
		
		x = 1;
		while (x != 0){
			x = input.nextInt();
			y = input.nextInt();
			
			if (x == 0 && y == 0){
				break;
			}
			if (x <= y){
				System.out.println(x + " " + y);
			}
			else if (x > y){
				System.out.println(y + " " + x);
			}
		}
	}
}