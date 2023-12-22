import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static final int MAX = 5000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<HashSet<Integer>> dot_list = new ArrayList<HashSet<Integer>>(MAX + 1);
		for(int i = 0; i <= MAX; i++){
			dot_list.add(new HashSet<Integer>());
		}
		
		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			for(Set<Integer> set : dot_list){
				set.clear();
			}
			
			for(int i = 0; i < n; i++){
				final int x = sc.nextInt();
				final int y = sc.nextInt();
				
				dot_list.get(y).add(x);
			}
			
			int max_size = 0;
			
			for(int y1 = 0; y1 <= MAX; y1++){
				for(int x1 : dot_list.get(y1)){
					for(int y2 = y1 + 1; y2 <= MAX; y2++){
						for(int x2 : dot_list.get(y2)){
							int diff_x = x2 - x1;
							int diff_y = y2 - y1;
							
							int pt_1_x = x1 + diff_y;
							int pt_1_y = y1 - diff_x;
							
							if(pt_1_x < 0 || pt_1_x > MAX || pt_1_y < 0 || pt_1_y > MAX){
								continue;
							}else if(!dot_list.get(pt_1_y).contains(pt_1_x)){
								continue;
							}
							
							int pt_2_x = pt_1_x + diff_x;
							int pt_2_y = pt_1_y + diff_y;
							
							if(pt_2_x < 0 || pt_2_x > MAX || pt_2_y < 0 || pt_2_y > MAX){
								continue;
							}else if(!dot_list.get(pt_2_y).contains(pt_2_x)){
								continue;
							}
							
							max_size = Math.max(max_size, diff_x * diff_x + diff_y * diff_y);
							
						}
					}
				}
			}
			
			System.out.println(max_size);
		}
	}
}