import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final char[] inputs = sc.nextLine().toCharArray();
		
		int[] map = new int[inputs.length];
		
		for(int i = 0; i < inputs.length; i++){
			map[i] = inputs[i] == '/' ? 1 : inputs[i] == '_' ? 0 : -1;
		}
		
		int[] maps = new int[inputs.length + 1];
		for(int i = 0; i < map.length; i++){
			maps[i + 1] = map[i]; 
		}
		for(int i = 1; i < maps.length; i++){
			maps[i] += maps[i - 1];
		}
		
		//System.out.println(Arrays.toString(map));
		//System.out.println(Arrays.toString(maps));
		
		LinkedList<Integer> area_list = new LinkedList<Integer>();
		
		int total_areas = 0;
		for(int cur_pos = 0; cur_pos < maps.length; cur_pos++){
			final int cur_height = maps[cur_pos];
			int areas = 0;
			
			boolean ok = false;
			for(int next_pos = cur_pos + 1; next_pos < maps.length; next_pos++){
				final int prev_height = maps[next_pos - 1] - cur_height;
				final int next_height = maps[next_pos] - cur_height;
				final int max_height = Math.abs(Math.max(prev_height, next_height));
				
				//System.out.println(cur_pos + ":" + next_pos + " [" + prev_height + " " + next_height + "]");
				
				if(next_height <= 0){
					areas += max_height;
					if(prev_height < next_height){
						areas += 1;
					}
				}
				
				if(next_height >= 0){
					cur_pos = next_pos - 1;
					ok = true;
					break;
				}
			}
			
			if(ok && areas > 0){
				total_areas += areas;
				area_list.add(areas);
			}
		}
		
		System.out.println(total_areas);
		System.out.print(area_list.size());
		for(int area : area_list){
			System.out.print(" " + area);
		}
		System.out.println();
		
		sc.close();
	}

}