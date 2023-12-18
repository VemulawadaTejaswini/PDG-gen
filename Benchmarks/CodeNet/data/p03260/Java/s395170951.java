import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a*b % 2 == 0){
			System.out.println("No");
		}else{
			System.out.println("Yes");

		}


	}


}




class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}

