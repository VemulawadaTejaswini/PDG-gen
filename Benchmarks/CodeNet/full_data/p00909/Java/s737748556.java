import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static class WeightUnionFind{
		int[] par;
		int[] diff_weight;
		
		WeightUnionFind(int n){
			par=new int[n];
			diff_weight = new int[n];
			
			for(int i=0;i<n;i++){
				par[i]=i;
				diff_weight[i] = 0;
			}
		}
		
		public int find(int x){
			if(par[x]==x){
				return x;
			}
			
			int old_par = par[x];
			
			par[x]=find(par[x]);
			diff_weight[x] += diff_weight[old_par];
			return par[x];
		}
		
		public Boolean same(int x,int y){
			return find(x)==find(y);
		}
		
		public int get_diff(int x, int y){
			return diff_weight[x] - diff_weight[y];
		}
		
		public void unite(int x,int y){
			if(find(x)==find(y)){
				return;
			}
			
			par[find(x)]=find(y);
		}
		
		public void set_diff(int x,int y, int d){
			if(find(x)==find(y)){
				return;
			}
			
			diff_weight[x] = d;
			par[x]=y;
		}
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			final int N = sc.nextInt();
			final int M = sc.nextInt();

			if (N == 0 && M == 0) {
				break;
			}
			
			WeightUnionFind wuf = new WeightUnionFind(N);
			
			for(int i = 0; i < M; i++){
				String op = sc.next();
				
				if(op.equals("!")){
					final int from = sc.nextInt() - 1;
					final int to = sc.nextInt() - 1;
					final int w = sc.nextInt();
					
					wuf.set_diff(from, to, w);
					
				}else{
					final int from = sc.nextInt() - 1;
					final int to = sc.nextInt() - 1;
					
					if(!wuf.same(from, to)){
						System.out.println("UNKOWN");
					}else{
						System.out.println(wuf.get_diff(from, to));
					}
				}
			}
			
		}

		sc.close();
	}

}