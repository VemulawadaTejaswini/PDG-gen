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
		int n =sc.nextInt();
		long p = 1;
		for(long i = 1;i <= n;i++){
			p *= i;
			p %= pow;
		}
		System.out.println(p);
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


