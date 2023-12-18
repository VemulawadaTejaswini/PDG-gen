/*
 * コラッツの問題
 * コラッツ数列に初期値を入れると値が1になるという予想
 */
import java.util.ArrayList;
import java.util.Scanner;

public class CollatzProblem{
	public static void main(String[] args) {
		//変数定義
		int s;
		ArrayList<Integer> callatzList = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();
		callatzList.add(s);

		int CollatzFunc(int s) {
			if(s % 2 == 0) {
				return s/2;
			}else {
				return s*3+1;
			}
		}//end func

		int Judge(int s) {
			if(callatzList.contains(s)) {
				return null;
			}else {
				return 1;
			}
		}//end func

		while(Judge(s)) {
			s = CollatzFunc(s);
			callatzList.add(s);
		}

		System.out.println(callatzList.get(collatzList.indexOf(s)));



	}
}