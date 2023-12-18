import java.util.ArrayList;
import java.util.Scanner;




class Main{


	static	ArrayList<Integer> one ;
	static	ArrayList<Integer> two ;
	static	ArrayList<Integer> three ;
	static	ArrayList<Integer> four ;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		int w =sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		if(max <= min + w){
			System.out.println(0);
		}else{
			System.out.println(max-(min+w));

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


