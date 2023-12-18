import java.util.Arrays;
import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int N =sc.nextInt();
		if(N < 1200){
			System.out.println("ABC");

		}else if(N < 2800){
			System.out.println("ARC");

		}else{
			System.out.println("AGC");
		}
	}
}



