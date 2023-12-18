import java.util.Arrays;
import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		//int N =sc.nextInt();
		int N =sc.nextInt();
		int[] a = new int[N];
		for(int i = 0;i < N;i++){
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		int min = a[0];
		int max = a[N-1];
		
		
			System.out.println(max-min);

		
		



	}
}




class Pair implements Comparable{
	String from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



