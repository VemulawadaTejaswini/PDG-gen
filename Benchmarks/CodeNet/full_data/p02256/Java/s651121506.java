import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int tmp;
		
		if(x > y) {
			while ((tmp = x % y) != 0) {
	            x = y;
	            y = tmp;
	        }
			System.out.println(y);
		}else if(x < y) {
			while ((tmp = y % x) != 0) {
	            y = x;
	            x = tmp;
	        }
			System.out.println(x);
		}else System.out.println(y);
	}
}