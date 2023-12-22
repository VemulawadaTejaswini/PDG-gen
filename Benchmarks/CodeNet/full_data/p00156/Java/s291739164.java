import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	Scanner sc =new Scanner(System.in);
	
	class T<A,B extends Comparable<B>> implements Comparable<T>{
		A first;
		B second;
		T(A f,B s){
			first = f;
			second = s;
		}
		
		@SuppressWarnings("unchecked")
		public int compareTo(T target){
			return second.compareTo((B) target.second);
		}
	}
	
	boolean type[][] ;
	int map[][];
	

	void run(){
		for(;;){
			int m = sc.nextInt();
			int n = sc.nextInt();
			if((n|m)==0){
				break;
			}
			
			type = new boolean[n][m];
			map = new int[n][m];
			
			int x = 0 ;int y = 0;
			
			for(int i = 0; i < n ; i++){
				Arrays.fill(map[i], -1);
				String buffer = sc.next();
				for(int j = 0 ; j < m;j++){
					type[i][j] = (buffer.charAt(j) != '#');

					if(buffer.charAt(j) == '&'){
						x = i;
						y = j;
					}
					
				}
			}
			
			PriorityQueue<T<T<Integer,Integer>,Integer>> q = new PriorityQueue<T<T<Integer,Integer>,Integer>>();
			
			q.add(new T<T<Integer,Integer>,Integer>(new T<Integer,Integer>(x,y),0));
			
			for(;;){
				if(q.isEmpty()){
					break;
				}
				
				T<T<Integer,Integer>,Integer> p = q.poll();
				
				if(map[p.first.first][p.first.second] != -1){
					continue;
				}
				map[p.first.first][p.first.second] = p.second;
				
				int dx[] = {1,-1,0,0};
				int dy[] = {0,0,1,-1};
				
				for(int i = 0 ; i < 4; i++){
					int ni = p.first.first + dx[i];
					int nj = p.first.second + dy[i];
					
					if(ni < 0 || nj < 0){
						continue;
					}
					if(ni >= n || nj >= m){
						continue;
					}
					if(map[ni][nj] != -1){
						continue;
					}
					

					q.add(new T<T<Integer,Integer>,Integer>(new T<Integer,Integer>(ni,nj),p.second + ((type[p.first.first][p.first.second] == type[ni][nj])?0:1)));
				}
			}
			int ans = Integer.MAX_VALUE;
			for(int i = 0 ; i < n ; i++){
				ans = Math.min(ans,map[i][0]);
				ans = Math.min(ans,map[i][m-1]);
			}

			for(int j = 0 ; j < m ; j++){
				ans = Math.min(ans,map[0][j]);
				ans = Math.min(ans,map[n-1][j]);
			}

			System.out.println((ans+1)/2);
		}
		
		
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}