import java.util.ArrayList;
import java.util.Scanner;




class Main{


	static	ArrayList<Integer> one ;
	static	ArrayList<Integer> two ;
	static	ArrayList<Integer> three ;
	static	ArrayList<Integer> four ;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(b-a == c-b){
			System.out.println("YES");
		}else{
			System.out.println("NO");

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


