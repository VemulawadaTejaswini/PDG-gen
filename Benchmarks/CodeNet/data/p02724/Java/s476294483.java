import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

		Calc res = new Calc(n);
		System.out.println( res.toString() );
	}
	public static class Calc {
		int inN;
		int inY;
		
		int out = -1;

		public Calc(int x) {
			int v1000 = x / 500;
			int v5 = (x%500) /5;
			
			out = 1000* v1000 + v5 * 5;
		}

		@Override
		public String toString() {
			return ""+ out;
		}
		
		

	}
	
}
