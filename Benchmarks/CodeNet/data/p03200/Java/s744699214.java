import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		int counter = 0;
		for(int i = s.length-2; i>=0;i--) {
			if(s[i]=='B'&&s[i+1]=='W') {
				int base = i;
				while(s[base+1]=='W') {
					s[base]='W';
					s[base+1]='B';
					counter++;
					if(base!=s.length-2) {
					base++;
					}
					else {
						break;
					}
				}
			}
		}
		System.out.println(counter);
	}
}
