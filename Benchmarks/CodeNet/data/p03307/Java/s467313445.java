import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		//int N =sc.nextInt();
		int N =sc.nextInt();
		if(N%2 == 0){
			System.out.println(N);
			
			
		}else{
			System.out.println(N*2);

		}
		



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



