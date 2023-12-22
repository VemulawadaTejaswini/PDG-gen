import java.util.Scanner;

public class Main {
	
	public static final int INF = Integer.MAX_VALUE / 4 + 1;
	public static final int MAX = 15;
	
	public static int[][] lists = new int[3][MAX];
	public static int[]   sizes = new int[3];
	
	public static int[][] prevs = new int[3][MAX];
	public static int[] p_sizes = new int[3];
	
	public static void lists_clear(){
		sizes[0] = sizes[1] = sizes[2] = 0;
	}
	
	public static void prevs_clear(){
		p_sizes[0] = p_sizes[1] = p_sizes[2] = 0;
	}
	
	public static void all_clear(){
		lists_clear();
		prevs_clear();
	}
	
	public static void print_list(int l){
		System.out.print(l + "  :");
		for(int i = 0; i < sizes[l]; i++){
			System.out.print(" " + lists[l][i]);
		}
		System.out.println();
	}
	
	public static void print_prev_list(int l){
		System.out.print(l + " p:");
		for(int i = 0; i < p_sizes[l]; i++){
			System.out.print(" " + prevs[l][i]);
		}
		System.out.println();
	}
	
	public static boolean range_check(int i){
		return 0 <= i && i < 3;
	}
	
	public static boolean is_goal(int n){
		return sizes[0] == n && sizes[1] == 0 && sizes[2] == 0 || sizes[0] == 0 && sizes[1] == 0 && sizes[2] == n;
	}
	
	public static int get_list_top(int i){
		if(!range_check(i)){
			return 0;
		}else if(sizes[i] == 0){
			return 0;
		}else{
			return lists[i][sizes[i] - 1];
		}
	}
	
	public static void save_to_prev(){
		for(int i = 0; i < 3; i++){
			p_sizes[i] = sizes[i];
			
			for(int j = 0; j < sizes[i]; j++){
				prevs[i][j] = lists[i][j];
			}
		}
	}
	
	public static void restore_from_prev(){
		for(int i = 0; i < 3; i++){
			sizes[i] = p_sizes[i];
			
			for(int j = 0; j < p_sizes[i]; j++){
				lists[i][j] = prevs[i][j];
			}
		}
	}
	
	public static boolean is_same(){
		for(int i = 0; i < 3; i++){
			if(sizes[i] != p_sizes[i]){
				return false;
			}
			
			for(int j = 0; j < sizes[i]; j++){
				if(lists[i][j] != prevs[i][j]){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void add_top(int l, int t){
		lists[l][sizes[l]] = t;
		sizes[l]++;
	}
	
	public static int remove_top(int l){
		int tmp = get_list_top(l);
		sizes[l]--;
		
		return tmp;
	}
	
	public static void do_move_nocheck(int cur, int pur){
		add_top(pur, remove_top(cur));
	}
	
	public static boolean can_move(int cur, boolean left){
		if(!range_check(cur)){
			return false;
		}else if(sizes[cur] == 0){
			return false;
		}
		
		final int pur = cur + (left ? -1 : 1);
		if(!range_check(pur)){
			return false;
		}
		
		final int cur_top = get_list_top(cur);
		final int pur_top = get_list_top(pur);
		
		if(cur_top <= pur_top){
			return false;
		}
		
		boolean same = false;
		
		do_move_nocheck(cur, pur);
		
		
		if(is_same()){
			same = true;
		}
		
		
		do_move_nocheck(pur, cur);
		
		if(same){
			return false;
		}else{
			return true;
		}
	}
	
	public static void do_forward_move(int cur, boolean left){
		final int pur = cur + (left ? -1 : 1);
		
		do_move_nocheck(cur, pur);
	}
	
	public static void do_backward_move(int cur, boolean left){
		final int pur = cur + (left ? -1 : 1);
		
		do_move_nocheck(pur, cur);
	}
	
	public static int dfs(final int n, int deep, final int m){
		if(deep > m){
			return INF;
		}
		
		if(is_goal(n)){
			/*
			System.out.println("--------------------");
			print_list(0);
			print_prev_list(0);
			print_list(1);
			print_prev_list(1);
			print_list(2);
			print_prev_list(2);
			*/
			return 0;
		}
		
		
		int min = INF;
		
		for(int left = 0; left < 2; left++){
			for(int cur = 0; cur < 3; cur++){
				boolean can = can_move(cur, left == 0);
				
				if(can){
					save_to_prev();
					
					do_forward_move(cur, left == 0);
					min = Math.min(min, dfs(n, deep + 1, m));
					do_backward_move(cur, left == 0);
					
					restore_from_prev();
				}
			}
		}
		
		return min + 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			all_clear();
			
			for(int i = 0; i < 3; i++){
				sizes[i] = sc.nextInt();
				
				for(int j = 0; j < sizes[i]; j++){
					lists[i][j] = sc.nextInt();
				}
			}
			
			//boolean clear = false;
			int count = dfs(n, 0, m);
			
			/*
			for(count = 0; count <= m; count++){
				
				System.out.println(count + " : --------------------");
				print_list(0);
				print_prev_list(0);
				print_list(1);
				print_prev_list(1);
				print_list(2);
				print_prev_list(2);
				
				
				if(is_goal(n)){
					clear = true;
					break;
				}
				
				boolean min_left = false;
				int min_cur = 0;
				int min = Integer.MAX_VALUE;
				
				for(int left = 0; left < 2; left++){
					for(int cur = 0; cur < 3; cur++){
						int ret = move(cur, left == 0, false);
						
						if(ret != 0 && ret < min){
							min = ret;
							min_cur = cur;
							min_left = left == 0;
						}
					}
				}
				
				if(min != Integer.MAX_VALUE){
					move(min_cur, min_left, true);
				}else{
					System.out.println("ERROR");
				}
			}
			*/
			
			System.out.println(count <= m ? count : -1);
		}
	}

}