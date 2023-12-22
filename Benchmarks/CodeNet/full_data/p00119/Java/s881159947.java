import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	
	/* 0 ... Unvisited
	 * 1 ... visiting
	 * 2 ... visited
	 */
	public static boolean visit(final int n, boolean[][] adj, final int cur, Stack<Integer> order, int[] color){
		color[cur] = 1;
		for(int i = 0; i < n; i++){
			if(!adj[cur][i]){
				continue;
			}
			
			if(color[i] == 2){
				continue;
			}else if(color[i] == 1){
				return false;
			}else if(!visit(n, adj, i, order, color)){
				return false;
			}
		}
		
		order.push(cur);
		color[cur] = 2;
		return true;
	}
	
	public static boolean topological_sort(final int n, boolean[][] adj, Stack<Integer> stack){
		int[] color = new int[n];
		
		for(int i = 0; i < n; i++){
			if(color[i] == 0 && !visit(n, adj, i, stack, color)){
				stack.clear();
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int m = sc.nextInt();
		final int n = sc.nextInt();
		
		boolean[][] relate = new boolean[m][m];
		
		for(int i = 0; i < n; i++){
			final int x = sc.nextInt() - 1;
			final int y = sc.nextInt() - 1;
			
			relate[x][y] = true;
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		if(!topological_sort(m, relate, stack)){
			return;
		}
		
		while(!stack.empty()){
			System.out.println(stack.pop() + 1);
		}
		
	}
}