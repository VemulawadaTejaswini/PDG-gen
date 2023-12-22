import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static class Walk {
		int bill;
		int pos;
		int time;
		
		public Walk(int bill, int pos, int time) {
			super();
			this.bill = bill;
			this.pos = pos;
			this.time = time;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[][] bill = new int[2][n];
			
			
			for(int i = 0; i < 2; i++){
				for(int j = 0; j < n; j++){
					bill[i][j] = sc.nextInt();
				}
			}
			
			boolean[][] visited = new boolean[2][n];
			LinkedList<Walk> queue = new LinkedList<Walk>();
			queue.add(new Walk(0, 0, 0));
			queue.add(new Walk(1, 0, 0));
			
			boolean flag = false;
			while(!queue.isEmpty()){
				Walk walk = queue.poll();
				
				if(visited[walk.bill][walk.pos]){
					continue;
				}else{
					visited[walk.bill][walk.pos] = true;
				}
				
				//System.out.println(walk.bill + " " + walk.pos + " " + walk.time);
				
				if(bill[walk.bill][walk.pos] == 2){
					queue.addFirst(new Walk(walk.bill, walk.pos - 1, walk.time));
					continue;
				}else if(bill[walk.bill][walk.pos] == 1 && (walk.pos != n - 1 && bill[walk.bill][walk.pos + 1] != 0)){
					queue.addFirst(new Walk(walk.bill, walk.pos + 1, walk.time));
					continue;
				}
				
				if(walk.pos == n - 1){
					System.out.println(walk.time);
					flag = true;
					break;
				}
				
				
				for(int next = 0; next <= 2; next++){
					if(walk.pos + next >= n){
						break;
					}else if(!visited[1 - walk.bill][walk.pos + next]){
						queue.add(new Walk(1 - walk.bill, walk.pos + next, walk.time + 1));
					}
				}		
			}
			
			if(!flag){
				System.out.println("NA");
			}
		}
	}

}