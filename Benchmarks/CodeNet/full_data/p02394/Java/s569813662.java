import java.util.Scanner;

class Main{

	public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

	int w = sc.nextInt();
	int h = sc.nextInt();
	int x = sc.nextInt();
	int y = sc.nextInt();
	int r = sc.nextInt();

	int max_x = x + r;
	int min_x = x - r;
	int max_y = y + r;
	int min_y = y - r;

		if(max_x <= w && min_x >= 0 && max_y <= h && min_y >= 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}