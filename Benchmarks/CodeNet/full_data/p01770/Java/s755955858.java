import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		final int E = sc.nextInt();
		final int S = sc.nextInt();
		final int T = sc.nextInt();
		final int R = sc.nextInt();
		
		int[] as = new int[N];
		int[] bs = new int[N];
		boolean[][] adj = new boolean[N][N];
		for(int i = 0; i < M; i++){
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			
			as[i] = a;
			bs[i] = b;
			adj[a][b] = adj[b][a] = true;
		}
		
		int[] cs = new int[E];
		int[] cas = new int[E];
		int[] cbs = new int[E];
		for(int i = 0; i < E; i++){
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			final int c = sc.nextInt();
			
			cs[i] = c;
			cas[i] = a;
			cbs[i] = b;
		}
		
		boolean[][] already = new boolean[N][1 << E];
		LinkedList<Integer> time_queue = new LinkedList<Integer>();
		LinkedList<Integer> move_queue = new LinkedList<Integer>();
		LinkedList<Integer> bits_queue = new LinkedList<Integer>();
		LinkedList<Integer> city_queue= new LinkedList<Integer>();
		
		bits_queue.add(0);
		city_queue.add(S);
		time_queue.add(0);
		move_queue.add(0);
		already[S][0] = true;
		
		while(!city_queue.isEmpty()){
			final int city = city_queue.poll();
			final int time = time_queue.poll();
			int bits = bits_queue.poll();
			final int move = move_queue.poll();
			
			if(city == T){
				System.out.println(move);
				return;
			}
			
			// check event
			for(int i = 0; i < E; i++){
				if(city == cs[i]){
					bits |= (1 << i);
				}
			}
			
			if(time < R){
				for(int i = 0; i < E; i++){
					if((bits & (1 << i)) != 0){
						adj[cas[i]][cbs[i]] = adj[cbs[i]][cas[i]] = true;
					}
				}
				
				for(int next = 0; next < N; next++){
					if(!adj[city][next]){
						continue;
					}else if(already[next][bits]){
						continue;
					}
					
					already[next][bits] = true;
					city_queue.add(next);
					time_queue.add(time + 1);
					bits_queue.add(bits);
					move_queue.add(move + 1);
				}
				
				for(int i = 0; i < E; i++){
					if((bits & (1 << i)) != 0){
						adj[cas[i]][cbs[i]] = adj[cbs[i]][cas[i]] = false;
					}
				}
			}
			
			if(!already[S][bits]){ // teleport
				already[S][bits] = true;
				city_queue.add(S);
				time_queue.add(0);
				bits_queue.add(bits);
				move_queue.add(move + 1);
			}
		}
		
		System.out.println(-1);
	}
	
} 