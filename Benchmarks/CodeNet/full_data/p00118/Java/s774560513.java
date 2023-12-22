import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static class Point{
		public int x,y;
		
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			
			if(H == 0 && W == 0){
				break;
			}
			
			char[][] input = new char[H][W];
			for(int i = 0; i < H; i++){
				char[] tmp = sc.next().toCharArray();
				for(int j = 0; j < W; j++){
					input[i][j] = tmp[j];
				}
			}
			
			int count = 0;
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					if (input[i][j] != '.') {
						count++;

						Queue<Integer> queue = new LinkedList<Integer>();
						queue.add(j + i * W);

						while (!queue.isEmpty()) {
							int k = queue.poll();
							final int x = k % W;
							final int y = k / W;
							final char in = input[y][x];

							input[y][x] = '.';

							if (x != 0 && in == input[y][x - 1]
									&& input[y][x - 1] != '.') {
								queue.add(y * W + (x - 1));
							}

							if (y != 0 && in == input[y - 1][x]
									&& input[y - 1][x] != '.') {
								queue.add((y - 1) * W + x);
							}

							if (x != W - 1 && in == input[y][x + 1]
									&& input[y][x + 1] != '.') {
								queue.add(y * W + (x + 1));
							}

							if (y != H - 1 && in == input[y + 1][x]
									&& input[y + 1][x] != '.') {
								queue.add((y + 1) * W + x);
							}

						}
					}
				}
			}
			
			System.out.println(count);
		}
		
		return;
	}
	
}