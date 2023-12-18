import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n, l;
		n = in.nextInt();
		l = in.nextInt();
		
		String[] S = new String[n];
		for (int i = 0; i < n; i++) S[i] = in.next();
		S.sort();
		for (int i = 0; i < n; i++) System.out.print(S[i]);
		System.out.println();
	}
}
