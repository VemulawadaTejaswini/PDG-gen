import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		char[] s = sc.next().toCharArray();
		boolean seen = false;
		for(int i = 1; i < n && k > 0; i++) {
			if(!seen && s[i] == s[0]) continue;
			else if(!seen && s[i] != s[0]) {
				s[i] = s[0];
				seen = true;
			}
			else if(seen && s[i] != s[0]) {
				s[i] = s[0];
			}
			else if(seen && s[i] == s[0]) {
				seen = false;
				k--;
			}
		}
		int res = 0;
		for(int i = 1; i < n; i++) {
			if(s[i] == s[i-1]) res++;
		}
		System.out.println(res);
	}

}
