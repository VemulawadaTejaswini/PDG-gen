public class Main {

	
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		while(true){
			final int math     = sc.nextInt();
			final int greedy   = sc.nextInt();
			final int geometry = sc.nextInt();
			final int dp       = sc.nextInt();
			final int graph    = sc.nextInt();
			final int other    = sc.nextInt();
			
			if(math == 0 && greedy == 0 && geometry == 0 && dp == 0 && graph == 0 && other == 0){
				break;
			}
			
			System.out.println(improved(math, greedy, geometry, dp, graph, other));
		}
	}
	
	public static int improved(int math, int greedy, int geometry, int dp, int graph, int other){
		int sum = math / 3 + greedy / 3 + geometry / 3 + dp / 3 + graph / 3 + other / 3;
		
		return sum + slow_bfs(math % 3, greedy % 3, geometry % 3, dp % 3, graph % 3, other % 3);
	}
	
	public static class BFS {
		int math, greedy, geometry, dp, graph, other;
		int contest;
		
		public BFS(int math, int greedy, int geometry, int dp, int graph, int other, int contest) {
			super();
			this.math = math;
			this.greedy = greedy;
			this.geometry = geometry;
			this.dp = dp;
			this.graph = graph;
			this.other = other;
			this.contest = contest;
		}
	}
	
	public static int slow_bfs(int math, int greedy, int geometry, int dp, int graph, int other){
		LinkedList<BFS> queue = new LinkedList<BFS>();
		queue.add(new BFS(math, greedy, geometry, dp, graph, other, 0));
		
		int max = 0;
		while(!queue.isEmpty()){
			BFS bfs = queue.poll();
			
			if(bfs.math + bfs.dp >= 3){
				if(bfs.math >= 3){
					queue.add(new BFS(bfs.math - 3, bfs.greedy, bfs.geometry, bfs.dp, bfs.graph, bfs.other, bfs.contest + 1));
				}
				if(bfs.math >= 2 && bfs.dp >= 1){
					queue.add(new BFS(bfs.math - 2, bfs.greedy, bfs.geometry, bfs.dp - 1, bfs.graph, bfs.other, bfs.contest + 1));
				}
				if(bfs.math >= 1 && bfs.dp >= 2){
					queue.add(new BFS(bfs.math - 1, bfs.greedy, bfs.geometry, bfs.dp - 2, bfs.graph, bfs.other, bfs.contest + 1));
				}
				if(bfs.dp >= 3){
					queue.add(new BFS(bfs.math, bfs.greedy, bfs.geometry, bfs.dp - 3, bfs.graph, bfs.other, bfs.contest + 1));
				}
			}
			
			if(bfs.greedy + bfs.graph >= 3){
				if(bfs.greedy >= 3){
					queue.add(new BFS(bfs.math, bfs.greedy - 3, bfs.geometry, bfs.dp, bfs.graph, bfs.other, bfs.contest + 1));
				}
				if(bfs.greedy >= 2 && bfs.graph >= 1){
					queue.add(new BFS(bfs.math, bfs.greedy - 2, bfs.geometry, bfs.dp, bfs.graph - 1, bfs.other, bfs.contest + 1));
				}
				if(bfs.greedy >= 1 && bfs.graph >= 2){
					queue.add(new BFS(bfs.math, bfs.greedy - 1, bfs.geometry, bfs.dp, bfs.graph - 2, bfs.other, bfs.contest + 1));
				}
				if(bfs.graph >= 3){
					queue.add(new BFS(bfs.math, bfs.greedy, bfs.geometry, bfs.dp, bfs.graph - 3, bfs.other, bfs.contest + 1));
				}
			}
			
			if(bfs.geometry + bfs.other >= 3){
				if(bfs.geometry >= 3){
					queue.add(new BFS(bfs.math, bfs.greedy, bfs.geometry - 3, bfs.dp, bfs.graph, bfs.other, bfs.contest + 1));
				}
				if(bfs.geometry >= 2 && bfs.other >= 1){
					queue.add(new BFS(bfs.math, bfs.greedy, bfs.geometry - 2, bfs.dp, bfs.graph, bfs.other - 1, bfs.contest + 1));
				}
				if(bfs.geometry >= 1 && bfs.other >= 2){
					queue.add(new BFS(bfs.math, bfs.greedy, bfs.geometry - 1, bfs.dp, bfs.graph, bfs.other - 2, bfs.contest + 1));
				}
				if(bfs.other >= 3){
					queue.add(new BFS(bfs.math, bfs.greedy, bfs.geometry, bfs.dp, bfs.graph, bfs.other - 3, bfs.contest + 1));
				}
			}
			
			for(int first = 0; first <= 1; first++){
				if(first == 0 && bfs.math < 1 || first == 1 && bfs.dp < 1){
					continue;
				}
				
				for(int second = 0; second <= 1; second++){
					if(second == 0 && bfs.greedy < 1 || second == 1 && bfs.graph < 1){
						continue;
					}
					
					for(int third = 0; third <= 1; third++){
						if(third == 0 && bfs.geometry < 1 || third == 1 && bfs.other < 1){
							continue;
						}
						
						queue.add(new BFS(
								bfs.math - (first == 0 ? 1 : 0), 
								bfs.greedy - (second == 0 ? 1 : 0),
								bfs.geometry - (third == 0 ? 1 : 0),
								bfs.dp - (first == 1 ? 1 : 0), 
								bfs.graph - (second == 1 ? 1 : 0),
								bfs.other - (third == 1 ? 1 : 0),
								bfs.contest + 1));
					}
				}
			}
			
			max = Math.max(max, bfs.contest);
		}
		
		return max;
	}
}