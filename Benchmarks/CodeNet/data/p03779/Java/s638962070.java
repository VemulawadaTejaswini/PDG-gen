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
		

		if(x % 2 == 1){
			System.out.println(x/2);
			
		}else{
			if(x == 2){
				System.out.println(2);
			}else{
				System.out.println(x/2);

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


