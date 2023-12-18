import java.util.ArrayList;
import java.util.Scanner;




class Main{


	static	ArrayList<Integer> one ;
	static	ArrayList<Integer> two ;
	static	ArrayList<Integer> three ;
	static	ArrayList<Integer> four ;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		long n = sc.nextLong();

		long ans = n;
		for(long i = 1; i*i <= n;i++){
			if(n % i == 0){
				long mm = Math.max(i, n/i);
				long keta = String.valueOf(mm).length();
				ans = Math.min(ans, keta);
			}
		}
		System.out.println(ans);



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


