import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static final int SIZE = 10;
	
	public static boolean is_ok(int x, int y){
		return x >= 0 && x < SIZE && y >= 0 && y < SIZE;
	}
	
	public static boolean big_ok(int x, int y, int[][] map){
		if(!is_ok(x - 2, y - 2) || !is_ok(x + 2, y + 2)){
			return false;
		}
		
		for(int dy = -2; dy <= 2; dy++){
			for(int dx = -2; dx <= 2; dx++){
				if(Math.abs(dx) + Math.abs(dy) > 2){
					continue;
				}
				
				if(map[y + dy][x + dx] <= 0){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static boolean middle_ok(int x, int y, int[][] map){
		if(!is_ok(x - 1, y - 1) || !is_ok(x + 1, y + 1)){
			return false;
		}
		
		for(int dy = -1; dy <= 1; dy++){
			for(int dx = -1; dx <= 1; dx++){
				if(map[y + dy][x + dx] <= 0){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static boolean small_ok(int x, int y, int[][] map){
		if(!is_ok(x - 1, y - 1) || !is_ok(x + 1, y + 1)){
			return false;
		}
		
		for(int dy = -1; dy <= 1; dy++){
			for(int dx = -1; dx <= 1; dx++){
				if(Math.abs(dx) + Math.abs(dy) > 1){
					continue;
				}
				
				if(map[y + dy][x + dx] <= 0){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static int general_ok(int x, int y, int[][] map){
		int ret = 3;
		
		if(!is_ok(x - 1, y - 1) || !is_ok(x + 1, y + 1)){
			return 0;
		}else if(!is_ok(x - 2, y - 2) || !is_ok(x + 2, y + 2)){
			ret = 2;
			
			for(int dy = -1; dy <= 1; dy++){
				for(int dx = -1; dx <= 1; dx++){
					if(Math.abs(dx) + Math.abs(dy) <= 1 && map[y + dy][x + dx] <= 0){
						return 0;
					}else if(map[y + dy][x + dx] <= 0){
						ret = Math.min(ret, 1);
					}
				}
			}
			
			return ret;
		}else{
			for(int dy = -2; dy <= 2; dy++){
				for(int dx = -2; dx <= 2; dx++){
					if(Math.abs(dx) + Math.abs(dy) <= 1 && map[y + dy][x + dx] <= 0){
						return 0;
					}else if(Math.abs(dx) == 1 && Math.abs(dy) == 1 && map[y + dy][x + dx] <= 0){
						ret = Math.min(ret, 1);
					}else if(Math.abs(dx) + Math.abs(dy) <= 2 && map[y + dy][x + dx] <= 0){
						ret = Math.min(ret, 2);
					}
				}
			}
			
			//System.out.println(ret);
			
			return ret;
		}
	}
	
	public static void attach_big(int x, int y, boolean flag, int[][] map){
		for(int dy = -2; dy <= 2; dy++){
			for(int dx = -2; dx <= 2; dx++){
				if(Math.abs(dx) + Math.abs(dy) > 2){
					continue;
				}
				
				map[y + dy][x + dx] += flag ? -1 : 1;
			}
		}
	}
	
	public static void attach_middle(int x, int y, boolean flag, int[][] map){
		for(int dy = -1; dy <= 1; dy++){
			for(int dx = -1; dx <= 1; dx++){
				map[y + dy][x + dx] += flag ? -1 : 1;
			}
		}
	}
	
	public static void attach_small(int x, int y, boolean flag, int[][] map){
		for(int dy = -1; dy <= 1; dy++){
			for(int dx = -1; dx <= 1; dx++){
				if(Math.abs(dx) + Math.abs(dy) > 1){
					continue;
				}
				
				map[y + dy][x + dx] += flag ? -1 : 1;
			}
		}
	}
	
	public static boolean is_over(int x, int y, int[][] map){
		if(!is_ok(x, y - 2)){
			return false;
		}
		
		return map[y - 2][x] > 0;
	}
	
	public static void disp(int[][] map){
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
	}
	
	public static void err(int[][] map){
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				System.err.print(map[i][j] + " ");
			}
			System.err.println();
		}
		System.err.println("-------------------");
	}
	
	public static boolean answer = false;
	public static int max = 0; 
	public static int[][] map;
	public static LinkedList<Integer> x_list, y_list, type_list;
	
	public static void dfs(int x, int y, int deep){
		//System.out.println(deep + " " + x + " " + y + " " + type_list);
		//disp(map);
		
		if(deep > max){
			return;
		}else if(answer){
			return;
		}
		
		for(int _y = y; _y < SIZE + 2; _y++){
			for(int _x = _y == y ? x : 0; _x < SIZE; _x++){
				if(answer){
					return;
				}
				//boolean flag = false;
				//System.out.println(deep + " " + _x + " " + _y + " " + type_list);
				//disp(map);
				
				final int check = general_ok(_x, _y, map);
				
				if(check >= 3){
					attach_big(_x, _y, true, map);
					
					x_list.addLast(_x);
					y_list.addLast(_y);
					type_list.add(3);
					
					dfs(_x, _y, deep + 1);
					if(answer){
						return;
					}
					
					x_list.removeLast();
					y_list.removeLast();
					type_list.removeLast();
					attach_big(_x, _y, false, map);
				}
				
				if(check >= 2){
					attach_middle(_x, _y, true, map);
					x_list.addLast(_x);
					y_list.addLast(_y);
					type_list.add(2);
					
					dfs(_x, _y, deep + 1);
					if(answer){
						return;
					}
					
					x_list.removeLast();
					y_list.removeLast();
					type_list.removeLast();
					attach_middle(_x, _y, false, map);
				}
				
				if(check >= 1){
					attach_small(_x, _y, true, map);
					x_list.addLast(_x);
					y_list.addLast(_y);
					type_list.add(1);
					
					dfs(_x, _y, deep + 1);
					if(answer){
						return;
					}
					
					x_list.removeLast();
					y_list.removeLast();
					type_list.removeLast();
					attach_small(_x, _y, false, map);
				}
				
				if(check == 0 && is_over(_x, _y, map)){
					return;
				}
			}
		}
		
		//if(deep != max){
		//	return;
		//}
		
		answer = true;
		return;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
			
		map = new int[SIZE][SIZE];
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				map[i][j] = sc.nextInt();
			}
		}
			
		x_list = new LinkedList<Integer>();
		y_list = new LinkedList<Integer>();
		type_list = new LinkedList<Integer>();
		
		max = n;
		
		dfs(0, 0, 0);
		
		if(!answer){
			System.err.println("error");
			err(map);
		}
		
		while(!x_list.isEmpty()){
			final int x = x_list.poll();
			final int y = y_list.poll();
			final int type = type_list.poll();
				
			System.out.println(x + " " + y + " " + type);
		}
	}

}