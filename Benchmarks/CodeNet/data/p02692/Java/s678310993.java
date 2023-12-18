import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

import atCoder.abc166.f.Main2.State;

public class Main {

	public static class State {
		int a;
		int b;
		int c;

		public State(int a, int b, int c) {
			super();
			this.a = a;
			this.b = b;
			this.c = c;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		State init = new State(a, b, c);
		
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		
		List<String> result = new ArrayList<>();  
		dfs( result, s, 0,n, init );
		
		if( result.size()== n ) {
			System.out.println("Yes");
			for (int i = result.size() -1; i >=0; i--) {
				System.out.println(result.get(i));
			}
		}else {
			System.out.println("No");
			
		}

	}

	private static boolean dfs(List<String> result, String[] s, int i, int n, State init) {
		if( i==n )return true;
		
		boolean noob = false;;
		switch (s[i]) {
		case "AB":
			noob = tryQueue(result,s, i, n, init,1,-1,0 , "A") ||
			tryQueue(result,s, i, n, init,-1,1,0 , "B");
			break;
		case "AC":
			noob = 
			tryQueue(result,s, i, n, init,1,0,-1 , "A") ||  
			tryQueue(result,s, i, n, init,-1,0,1 , "C");
			break;
		case "BC":
			noob = 
			tryQueue(result,s, i, n, init,0,1,-1 , "B") ||
			tryQueue(result,s, i, n, init,0,-1,1 , "C");
			break;
		default:
			break;
		}	
		return noob;
	}

	private static boolean tryQueue(List<String> result, String[] s, int level, int n,  State init, int i, int j, int k, String dir) {
		int a = init.a + i;
		int b = init.b + j;
		int c = init.c + k;

		if (a < 0 || b < 0 || c < 0)
			return false;
		State e = new State( a, b, c);
		if( dfs(result, s, level+1, n, e) ) {
			result.add(dir);
			return true;
		};
		
		return false;
	}

}