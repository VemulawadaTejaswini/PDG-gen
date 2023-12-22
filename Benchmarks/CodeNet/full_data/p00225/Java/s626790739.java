import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static class UnionFind{
		int[] dat;
		
		public UnionFind(int n){
			dat = new int[n];
			for(int i = 0; i < n; i++){
				dat[i] = i;
			}
		}
		
		public int find(int x){
			if(dat[x] == x){
				return x;
			}else{
				return dat[x] = find(dat[x]);
			}
		}
		
		public void union(int x, int y){
			if(find(x) == find(y)){
				return;
			}else{
				dat[find(x)] = find(y);
			}
		}
		
		public boolean same(int x, int y){
			return find(x) == find(y);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[] count = new int[26];
			
			HashSet<Integer> using = new HashSet<Integer>();
			UnionFind uf = new UnionFind(26);
			int start = -1;
			for(int i = 0; i < n; i++){
				char[] in = sc.next().toCharArray();
				
				final int from = in[0] - 'a';
				final int to = in[in.length - 1] - 'a';
				count[from]++;
				count[to]++;
				uf.union(from, to);
				using.add(from);
				using.add(to);
				
				if(start == -1){
					start = from;
				}
			}
			
			boolean flag = true;
			for(int in : using){
				if(!uf.same(in, start) || count[in] % 2 != 0){
					flag = false;
					break;
				}
			}
			
			if(!flag){
				System.out.println("NG");
			}else{
				System.out.println("OK");
			}
		}
	}

}