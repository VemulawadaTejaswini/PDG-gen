import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	
	static boolean t = true;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int w = sc.nextInt(), h = sc.nextInt();
			
			if(w == 0 || h == 0){
				return;
			}
			
			char[][] map = new char[h][w];
			int s_x = 0,s_y = 0;
			
			for(int i = 0; i < h; i++){
				char[] tmp = sc.next().toCharArray();
				
				for(int j = 0; j < w; j++){
					if(tmp[j] == '@'){
						tmp[j] = '.';
						s_x = j;
						s_y = i;
					}
					map[i][j] = tmp[j];
				}
			}
			
			LinkedList<Integer> list = new LinkedList<Integer>();
			list.add((s_x << 16) + s_y);
			int count = 0;
			
			while(!list.isEmpty()){
				int t = list.poll();
				int x = t >> 16;
				int y = t & 0x00ff;
				
				System.out.println(x + "," + y);
				
				if(map[y][x] == '.'){
					count++;
					map[y][x] = 'x';
				}else{
					continue;
				}
				
				if(x > 0){
					list.push(((x - 1) << 16) + y);
				}
				
				if(x < (w-1)){
					list.push(((x + 1) << 16) + y);
				}
				
				if(y > 0){
					list.push((x << 16) + (y - 1));
				}
				
				if(y < (h-1)){
					list.push((x << 16) + (y + 1));
				}
			}
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
			
			System.out.println(count);
		}
		
	}
	
	
}