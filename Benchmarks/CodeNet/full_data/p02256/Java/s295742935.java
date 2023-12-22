import java.util.Scanner;

public class Main {

	static int bmp(int x,int y){
		while(y > 0){
			int r = x % y;
			x = y;
			y = r;
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] gcd = in.nextLine().split(" ");
		int x = Integer.parseInt(gcd[0]);
		int y = Integer.parseInt(gcd[1]);
			if(x<y){
				int big = y;
				int small = x;
				System.out.println(bmp(big,small));
			}
			else{
				int big = x;
				int small = y;
				System.out.println(bmp(big,small));
			}
		}
}