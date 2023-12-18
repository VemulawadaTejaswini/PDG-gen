import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Main{

	static int[] p;
	static	int N ;
	static	int M ;


	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		//N = scanner.nextInt();
		//M = scanner.nextInt();

		String s = scanner.next();
		String t = scanner.next();

		ArrayList<String> slist = new ArrayList<String>();
		ArrayList<String> tlist = new ArrayList<String>();

		for(int i = 0;i < s.length();i++){
			slist.add(s.substring(i, i+1));
		}
		for(int i = 0;i < t.length();i++){
			tlist.add(t.substring(i, i+1));
		}
		Collections.sort(slist);
		Collections.sort(tlist,Comparator.reverseOrder());
		s = slist.toString();
		t = tlist.toString();

//		System.out.println("s "+s);
//		System.out.println("t "+t);
//		System.out.println(t.compareTo(s));


		if(t.compareTo(s) >= 1){
			System.out.println("Yes");
		}else{
			System.out.println("No");

		}

	}


}

class Pair implements Comparable{
	int from;
	int middle;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



