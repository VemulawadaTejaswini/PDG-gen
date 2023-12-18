import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char a[] = scan.nextLine().toCharArray();
		char b[] = scan.nextLine().toCharArray();
		char c[] = scan.nextLine().toCharArray();
		
		int max = Integer.MAX_VALUE;
		max = Math.min(max, compose(compose(a, b), c).length);
		max = Math.min(max, compose(compose(b, a), c).length);
		max = Math.min(max, compose(compose(a, c), b).length);
		max = Math.min(max, compose(compose(c, a), b).length);
		max = Math.min(max, compose(compose(b, c), a).length);
		max = Math.min(max, compose(compose(c, b), a).length);
		max = Math.min(max, compose(a, compose(b, c)).length);
		max = Math.min(max, compose(a, compose(c, b)).length);
		max = Math.min(max, compose(b, compose(a, c)).length);
		max = Math.min(max, compose(b, compose(c, a)).length);
		max = Math.min(max, compose(c, compose(a, b)).length);
		max = Math.min(max, compose(c, compose(b, a)).length);
		System.out.println(max);
	}
	
	public static char[] compose(char[] a, char[] b) {
		int A = a.length;
		int B = b.length;
		
		int length = 0;
		
		for(int i = 0;i < Math.min(A, B);i ++) {
			for(int j = 0;j < i + 1;j ++) {
				if(!equal(a[A - i - 1 + j], b[j])) break;
				if(j == i) length = Math.max(length, j + 1);
			}
		}
		
		char[] ans = new char[A + B - length];
		for(int i = 0;i < A - length;i ++) {
			ans[i] = a[i];
		}
		for(int i = 0;i < length;i ++) {
			ans[A - length + i] = check(a[A - length + i], b[i]);
		}
		for(int i = 0;i < B - length;i ++) {
			ans[A + i] = b[length + i];
		}
		return ans;
	}
	
	public static char check(char a, char b) {
		if(a == '?') return b;
		return a;
	}
	
	public static boolean equal(char a, char b) {
		return a == b || a == '?' || b == '?';
	}
}
