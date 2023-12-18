import java.util.ArrayList;
import java.util.Scanner;




class Main{


	static	ArrayList<Integer> one ;
	static	ArrayList<Integer> two ;
	static	ArrayList<Integer> three ;
	static	ArrayList<Integer> four ;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		String a = sc.next();
		String b = sc.next();

		if(a.length() > b.length()){
			System.out.println("GREATER");
		}else if(a.length() < b.length()){
			System.out.println("LESS");

		}else{
			for(int i = 0;i < a.length();i++){
				if(Character.getNumericValue(a.charAt(i)) > Character.getNumericValue(b.charAt(i))){
					System.out.println("GREATER");
					return;

				}else if(Character.getNumericValue(a.charAt(i)) < Character.getNumericValue(b.charAt(i))){
					System.out.println("LESS");
					return;

				}
				
			}
			
			System.out.println("EQUAL");

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


