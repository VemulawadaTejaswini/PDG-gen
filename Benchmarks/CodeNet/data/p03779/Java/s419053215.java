import java.util.ArrayList;
import java.util.Scanner;




class Main{


	static	ArrayList<Integer> one ;
	static	ArrayList<Integer> two ;
	static	ArrayList<Integer> three ;
	static	ArrayList<Integer> four ;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		int x =sc.nextInt();
		

		int t = 1;
		for(int i = 1;i <= x;i++){
			t *= i;
			if(t >= x){
				System.out.println(i);
				return;
			}
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


