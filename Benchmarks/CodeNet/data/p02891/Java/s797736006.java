import java.util.*;
 
public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int k = sc.nextInt();
		long count = 0;
		for(int i = 0; i < s.length-1; i++) {
			if(s[i]==s[i+1]) {
				count++;
				s[i+1]='.';
			}
			else continue;
		}
		if(s[s.length-1]==s[0]) count++;
		System.out.println((long)count*k);
	}
}