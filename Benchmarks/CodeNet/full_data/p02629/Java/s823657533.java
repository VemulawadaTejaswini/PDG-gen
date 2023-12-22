import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long a = 26;
		
		char[] al = new char[26];
		String[] alp = new String[26]; 
		ArrayList<String> alph = new ArrayList<String>();
		for(int i = 0; i<26;i++) {
			al[i] = (char)(97+i);
			alp[i] = String.valueOf(al[i]);
			alph.add(alp[i]);
		}
		
		ArrayList<String> list = new ArrayList<String>();
		
		//141167095653375
		
		while(true) {
			if(n < 27) {
				list.add(alph.get((int)n-1));
				break;
			}
			long end = n % a;
			
			if(end == 0) {
				end = 26;
			}
			//System.out.println(end);
			list.add(alph.get((int)end-1));
			long ans = (n-end) / a;
			//System.out.println(ans);
			if(ans < 27) {
				list.add(alph.get((int)ans-1));
				break;
			}
			n = ans;
				
		}
		Collections.reverse(list);
		for(String item:list) {
			System.out.print(item);
		}
	}

}
