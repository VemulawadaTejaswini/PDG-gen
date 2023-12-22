import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		int[][] other_dice = new int[7][7];
		
		other_dice[1][3] = 2;
		other_dice[1][2] = 4;
		other_dice[1][4] = 5;
		other_dice[1][5] = 3;
		
		other_dice[2][1] = 3;
		other_dice[2][3] = 6;
		other_dice[2][4] = 1;
		other_dice[2][6] = 4;
		
		other_dice[3][1] = 5;
		other_dice[3][2] = 1;
		other_dice[3][5] = 6;
		other_dice[3][6] = 2;
		
		other_dice[4][1] = 2;
		other_dice[4][2] = 6;
		other_dice[4][5] = 1;
		other_dice[4][6] = 5;
		
		other_dice[5][1] = 4;
		other_dice[5][3] = 1;
		other_dice[5][4] = 6;
		other_dice[5][6] = 3;
		
		other_dice[6][2] = 3;
		other_dice[6][3] = 5;
		other_dice[6][4] = 2;
		other_dice[6][5] = 4;
		
		
		while(true){
			int n = sc.nextInt();
		
			if(n == 0){
				return;
			}
			
			int height[][] = new int[200][200];
			int dice[][] = new int[200][200];
			
			for(int i = 0; i < n; i++){
				int cur_x = 100, cur_y = 100;
				
				int top = sc.nextInt();
				int front = sc.nextInt();
				
				while(true){
					int left_side = other_dice[top][front];
					int right_side = 7 - left_side;
					int back = 7 - front;
					
					//System.out.println(cur_x + ", " + cur_y);
					
					boolean can_front = (front >= 4) && (height[cur_y][cur_x] > height[cur_y+1][cur_x]);
					//System.out.println(height[cur_y][cur_x] + " -> " + height[cur_y+1][cur_x]);
					boolean can_back = (back >= 4) && (height[cur_y][cur_x] > height[cur_y-1][cur_x]);
					//System.out.println(height[cur_y][cur_x] + " -> " + height[cur_y-1][cur_x]);
					boolean can_left = (left_side >= 4) && (height[cur_y][cur_x] > height[cur_y][cur_x-1]);
					//System.out.println(height[cur_y][cur_x] + " -> " + height[cur_y][cur_x-1]);
					boolean can_right = (right_side >= 4) && (height[cur_y][cur_x] > height[cur_y][cur_x+1]);
					//System.out.println(height[cur_y][cur_x] + " -> " + height[cur_y][cur_x+1]);
				
					if(can_front || can_left || can_right || can_back){
						if(can_front){
							if((!can_left || front > left_side) && (!can_right || front > right_side) && (!can_back || front > back)){
								cur_y++;
								front = top;
								top = back;
								continue;
							}
						}
						
						if(can_back){
							if((!can_left || back > left_side) && (!can_right || back > right_side) && (!can_front || back > front)){
								cur_y--;
								int old = top;
								top = front;
								front = 7 - old;
								continue;
							}
						}
						
						if(can_left){
							if((!can_front || left_side > front) && (!can_right || left_side > right_side) && (!can_back || left_side > back)){
								cur_x--;
								top = right_side;
								continue;
							}
						}
						
						if(can_right){
							if((!can_left || right_side > left_side) && (!can_front || right_side > front) && (!can_back || right_side > back)){
								cur_x++;
								top = left_side;
								continue;
							}
						}
						
						
					}else{
						height[cur_y][cur_x]++;
						dice[cur_y][cur_x] = top;
						//System.out.println(top);
						break;
					}
				}
			}
			
			int[] counts = new int[6];
			for(int i = 0; i < 200; i++){
				for(int j = 0; j < 200; j++){
					if(dice[i][j] > 0){
						counts[dice[i][j]-1]++;
					}
				}
			}
			
			System.out.println(counts[0] + " " + counts[1] + " " + counts[2] + " " + counts[3] + " " + counts[4] + " " + counts[5]);
			
		}
		
		
		
		
	}
}	