import java.util.ArrayList;
import java.util.Scanner;




class Main{


	static	ArrayList<Integer> one ;
	static	ArrayList<Integer> two ;
	static	ArrayList<Integer> three ;
	static	ArrayList<Integer> four ;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();



		char[] longmozi ;
		char[] shortmozi ;

		if(a.length != b.length){


			for(int i = 0;i < b.length;i++){
				System.out.print(a[i]);
				System.out.print(b[i]);

			}
			System.out.print(a[a.length-1]);
		}else{
			for(int i = 0;i < b.length;i++){
				System.out.print(a[i]);
				System.out.print(b[i]);

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


