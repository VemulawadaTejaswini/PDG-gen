import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x,y;

		while((x = scan.nextInt()) != 0 && (y = scan.nextInt()) != 0){
			if(y < x){
				int tmp = x;
				x = y;
				y = tmp;
			}

			System.out.println(x + " " + y);
		}
	}
}