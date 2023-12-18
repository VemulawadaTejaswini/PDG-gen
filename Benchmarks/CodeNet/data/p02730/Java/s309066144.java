import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//文字列を分割するためにchar配列で取得
		char[] ch = sc.next().toCharArray();
		//文字列を前半・後半部分に分割
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		for(int i = 0; i < (ch.length-1) / 2 ; i++) {
			sb1.append(ch[i]);	
			sb2.append(ch[(ch.length + 3) / 2 - 1 + i]);
		}
		String s1 = sb1.toString();
		String sr1 = sb1.reverse().toString();
		String s2 = sb2.toString();
		String sr2 = sb2.reverse().toString();
		//out.println(s1 + " " + s2);
		//out.println(sr1 + " " + sr2);
		
		boolean flag = true;

		if (!s1.equals(s2) || !s1.equals(sr1) || !s2.equals(sr2)) {
			flag = false;
		}
		
		if (flag) out.println("Yes");
		else out.println("No");
				
	}
}