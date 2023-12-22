import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();
		StringBuilder t1 = new StringBuilder(t);
		char ch = '?';

		int pos = t.indexOf(ch);

		for(int i=0; pos>=0; i++) {
 		if(t1.charAt(pos-1)=='P'){
 			t1.setCharAt(pos,'D');
 		}else if(t1.charAt(pos+1)=='P'){
 			t1.setCharAt(pos, 'D');
 		}
 		else {
 			t1.setCharAt(pos,'P');
 		}
			pos = t.indexOf(ch,pos+1);
		}
		System.out.println(t1);
	}

}