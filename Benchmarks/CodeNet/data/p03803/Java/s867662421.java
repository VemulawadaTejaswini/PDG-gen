import java.util.ArrayList;
import java.util.Scanner;




class Main{


	static	ArrayList<Integer> one ;
	static	ArrayList<Integer> two ;
	static	ArrayList<Integer> three ;
	static	ArrayList<Integer> four ;
	static long pow = 1000000007;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		int a =sc.nextInt();
		int b =sc.nextInt();

		if(a > b){
			if(b != 1){
				System.out.println("Alice");
			}else{
				System.out.println("Bob");

			}
		}else if(a < b){
			if(a != 1){
				System.out.println("Bob");
			}else{
				System.out.println("Alice");
			}

		}else{
			System.out.println("Draw");

		}


	}



}

class Pair implements Comparable{
	Character from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


