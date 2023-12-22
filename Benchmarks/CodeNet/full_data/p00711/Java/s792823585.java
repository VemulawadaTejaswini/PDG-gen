public class Main {

	public static void main(String[] args) {
		search();
	}
	
	public static void search(){
		Queue<Integer> xqueue = new LinkedList<Integer>();
		Queue<Integer> yqueue = new LinkedList<Integer>();
		
		int X; int Y;
		
		Scanner input = new Scanner(System.in);
		
		String[][] grid;
		int[][] visit;
		int currentX = 0;; int currentY = 0;

		X = input.nextInt();
		Y = input.nextInt();
		if(X == 0 && Y ==0){
			input.close();
			System.exit(0);
		}
		
		grid = new String[Y][X];
		visit = new int[Y][X];
		
		for(int i = 0; i < Y; i++){
			String[] tmp = input.next().split("");
			for(int z = 1; z < tmp.length; z++){
				grid[i][z-1] = tmp[z];
			}
			
			for(int j = 0; j < X; j++){
				if(grid[i][j].equals("@")){
					currentX = j; currentY = i;
				}
			}
		}
		
		yqueue.offer(currentY);
		xqueue.offer(currentX);
								
		while(yqueue.peek() != null && xqueue.peek() != null){
			
			if(yqueue.peek() != null && xqueue.peek() != null){
				currentY = yqueue.poll();
				currentX = xqueue.poll();
			}
			
			if(visit[currentY][currentX] == 0 && !(grid[currentY][currentX].equals("#"))){
				visit[currentY][currentX] = 1;
				if(currentY > 0 && currentY < Y-1 && currentX > 0 && currentX < X-1){
					if(grid[currentY-1][currentX].equals(".")){
						yqueue.offer(currentY-1); xqueue.offer(currentX);
					}
					if(grid[currentY+1][currentX].equals(".")){
						yqueue.offer(currentY+1); xqueue.offer(currentX);
					}
					if(grid[currentY][currentX-1].equals(".")){
						yqueue.offer(currentY); xqueue.offer(currentX-1);
					}
					if(grid[currentY][currentX+1].equals(".")){
						yqueue.offer(currentY); xqueue.offer(currentX+1);
					}
				}
				else if(currentY == 0 && currentX > 0 && currentX < X-1){
					if(grid[currentY][currentX-1].equals(".")){
						yqueue.offer(currentY); xqueue.offer(currentX-1);
					}
					if(grid[currentY][currentX+1].equals(".")){
						yqueue.offer(currentY); xqueue.offer(currentX+1);
					}
					if(grid[currentY+1][currentX].equals(".")){
						yqueue.offer(currentY+1); xqueue.offer(currentX);
					}
				}
				else if(currentY == 0 && currentX == X-1){
					if(grid[currentY][currentX-1].equals(".")){
						yqueue.offer(currentY); xqueue.offer(currentX-1);
					}
					if(grid[currentY+1][currentX].equals(".")){
						yqueue.offer(currentY+1); xqueue.offer(currentX);
					}
				}
				else if(currentY == 0 && currentX == 0){
					if(grid[currentY][currentX+1].equals(".")){
						yqueue.offer(currentY); xqueue.offer(currentX+1);
					}
					if(grid[currentY+1][currentX].equals(".")){
						yqueue.offer(currentY+1); xqueue.offer(currentX);
					}
				}
				else if(currentY > 0 && currentY < Y-1 && currentX == 0){
					if(grid[currentY-1][currentX].equals(".")){
						yqueue.offer(currentY-1); xqueue.offer(currentX);
					}
					if(grid[currentY+1][currentX].equals(".")){
						yqueue.offer(currentY+1); xqueue.offer(currentX);
					}
					if(grid[currentY][currentX+1].equals(".")){
						yqueue.offer(currentY); xqueue.offer(currentX+1);
					}
				}
				else if(currentY == Y-1 && currentX == 0){
					if(grid[currentY][currentX+1].equals(".")){
						yqueue.offer(currentY); xqueue.offer(currentX+1);
					}
					if(grid[currentY-1][currentX].equals(".")){
						yqueue.offer(currentY-1); xqueue.offer(currentX);
					}
				}
				else if(currentY > 0 && currentY < Y-1 && currentX == X-1){
					if(grid[currentY][currentX-1].equals(".")){
						yqueue.offer(currentY); xqueue.offer(currentX-1);
					}
					if(grid[currentY+1][currentX].equals(".")){
						yqueue.offer(currentY+1); xqueue.offer(currentX);
					}
					if(grid[currentY-1][currentX].equals(".")){
						yqueue.offer(currentY-1); xqueue.offer(currentX);
					}
				}else if(currentY == Y-1 && currentX == X-1){
					if(grid[currentY-1][currentX].equals(".")){
						yqueue.offer(currentY-1); xqueue.offer(currentX);
					}
					if(grid[currentY][currentX-1].equals(".")){
						yqueue.offer(currentY); xqueue.offer(currentX-1);
					}
				}else if(currentY == Y-1 && currentX > 0 && currentX < X-1){
					if(grid[currentY][currentX+1].equals(".")){
						yqueue.offer(currentY); xqueue.offer(currentX+1);
					}
					if(grid[currentY][currentX-1].equals(".")){
						yqueue.offer(currentY); xqueue.offer(currentX-1);
					}
				}
			}
			
			
		}
		
		int count = 0;
		for(int i = 0; i < visit.length; i++){
			for(int j = 0; j < visit[i].length; j++){
				if(visit[i][j] == 1){
					count++;
				}
			}
		}
		System.out.println(count);
		search();
		
	}

}