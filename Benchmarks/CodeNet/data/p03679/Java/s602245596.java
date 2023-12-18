import java.util.ArrayList;
import java.util.Scanner;

class Main{

	static int N;
	static int M;
	static 		ArrayList<ArrayList<Integer>> map;
	static boolean[] used;
	static int f = 0;
	static int s = 0;

	static int mindis = 1000000000;
	static ArrayList<Integer> saitan;




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(b- a <= 0){
			System.out.println("delicious");
		}else if(b - a <= x ){
			System.out.println("safe");

		}else{
			System.out.println("dangerous");

		}
		
		
	}

}


