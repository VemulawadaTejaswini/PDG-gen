import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		//配列array
		ArrayList<Integer> array = new ArrayList<Integer>();

		int n  = src.nextInt();

		//nに入力された数だけ繰り返し、配列に要素を代入
		for(int i=0; i<n; i++) {
			array.add(src.nextInt());
		}

		int q = src.nextInt();

		for(int i=0; i<q; i++) {

			int com = src.nextInt();
			int b = src.nextInt();
			int e = src.nextInt();

			int min, max = 0;
			max	=	array.get(b);		
			min = max;

			if(com == 0) {
				for(int j = b+1; j < e; j++)
		            min = Math.min(min,array.get(j));
				System.out.println(min);

			}else if(com == 1) {
				for(int j = b+1; j < e; j++)
		            max = Math.max(max,array.get(j));
				System.out.println(max);
			}
		}
	}
}
