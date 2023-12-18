import java.util.Scanner;

class Main{
	static int[][] dp;




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int ans =(N-h+1)*(N-w+1);
		System.out.println(ans);
		
	}


}







class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

