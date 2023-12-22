
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();
		StringBuilder t1 = new StringBuilder(t);
		char ch = '?';
		int i = 0;
		int pos = t.indexOf(ch);

		for(i=0; pos>=0; i++) {
 		if(t1.charAt(pos-1)=='D'){
 			t1.setCharAt(pos,'P');
 		}else {
 			t1.setCharAt(pos,'D');
 		}
			pos = t.indexOf(ch,pos+1);
		}
		System.out.println(t1);
	}

}
