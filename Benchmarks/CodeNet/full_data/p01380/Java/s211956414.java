import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static class Problem implements Comparable<Problem>{
		int cost;
		int limit;
		
		public Problem(int cost, int limit) {
			super();
			this.cost = cost;
			this.limit = limit;
		}

		@Override
		public int compareTo(Problem arg0) {
			return this.limit - arg0.limit;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		
		PriorityQueue<Problem> queue = new PriorityQueue<Problem>();
		for(int i = 0; i < N; i++){
			queue.add(new Problem(sc.nextInt(), sc.nextInt()));
		}
		
		int count = 0;
		int time = 0;
		PriorityQueue<Problem> rev_queue = new PriorityQueue<Problem>(N, new Comparator<Problem>(){
			@Override
			public int compare(Problem o1, Problem o2) {
				return o2.cost - o1.cost;
			}
		});
		
		while(!queue.isEmpty()){
			Problem problem = queue.poll();
			
			int next_time = time + problem.cost;
			
			if(next_time > problem.limit){
				if(!rev_queue.isEmpty()){
					Problem max_problem = rev_queue.poll();
					next_time -= max_problem.cost;
					count--;
					
					if(next_time > problem.limit){
						count++;
						rev_queue.add(max_problem);
						continue;
					}
				}
			}
			
			count++;
			time = next_time;
			rev_queue.add(problem);
		}

		System.out.println(count);
	}

}