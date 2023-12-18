import java.util.Comparator;
import java.util.Scanner;

class Main{


	static int[][] map ;
	static long INF =Long.MAX_VALUE/2;
	static int n,m ;
	static	long[] dis;

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		for(int i = 0;i < 10000;i++){
			int x = a * i;
			if(x % b == c){
				System.out.println("YES");
				return;

			}
		}




		System.out.println("NO");




	}
}





class MyComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {

		int num1 = (int)obj1;
		int num2 = (int)obj2;

		if(num1 < num2) {
			return 1;
		} else if(num1 > num2) {
			return -1;
		} else{
			return 0;
		}
	}
}


