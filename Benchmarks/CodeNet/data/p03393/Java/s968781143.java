import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] a = s.toCharArray();
		char[] b = new char[26];
		if(s.length() == 26){
			for(int i=25; i>0; i--){
				if(a[i-1]-a[i] != 1){
					a[i-1] = (char) (a[i-1]+1);
					a[i] = ' ';
					System.out.println(a);
					return;
				}
				a[i] = ' ';
			}
			System.out.println(-1);
		} else{
			for(int i=0; i<s.length(); i++){
				b[a[i]-'a'] = a[i];
			}
			for(int i=0; i<26; i++){
				if(b[i] == 0){
					b[i] = (char) (b[i-1] + 1);
					System.out.println(s+b[i]);
					return;
				}
			}
		}
	}
}
