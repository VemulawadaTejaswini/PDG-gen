import java.io.*;
import java.math.*;
import java.util.*;
public class Main{

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();
		long ans = 0;
		long R = input.nextLong();
		long S = input.nextLong();
		long P = input.nextLong();
		String T = input.next();
		boolean[] v = new boolean[N];
		for (int i = 0; i < N; i++) {
			if (i-K>=0&&T.charAt(i-K)==T.charAt(i)&&v[i-K]) continue;
			else {
				v[i]=true;
				char cur = WIN(T.charAt(i));
				if (cur=='p') ans+=P;
				else if (cur=='r') ans+=R;
				else if (cur=='s') ans+=S;
			}
		}
		System.out.println(ans);
	}
	public static char WIN(char x) {
		if (x=='r') return 'p';
		if (x=='p') return 's';
		return 'r';
	}
}