import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int ID_MAX = 1000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			String prev_day = "";
			boolean[] is_in = new boolean[ID_MAX];
			int[] in_time = new int[ID_MAX];
			int[] bless_time = new int[ID_MAX];
			
			for(int q = 0; q < n; q++){
				final String day = sc.next();
				
				if(!prev_day.equals(day)){
					prev_day = day;
					Arrays.fill(is_in, false);
					Arrays.fill(in_time, Integer.MAX_VALUE);
				}
				
				String time_str[] = sc.next().split(":");
				final int time = Integer.parseInt(time_str[0]) * 60 + Integer.parseInt(time_str[1]);
				
				boolean in = sc.next().equals("I");
				
				final int id = sc.nextInt();
				
				if(id == 0){
					if(in){
						is_in[id] = true;
						
						for(int i = 0; i < ID_MAX; i++){
							if(is_in[i]){
								in_time[i] = time;
							}
						}
					}else{
						is_in[id] = false;
						
						for(int i = 0; i < ID_MAX; i++){
							if(is_in[i]){
								 bless_time[i] += time - in_time[i];
							}
						}
					}
				}else{
					if(in){
						is_in[id] = true;
						in_time[id] = time; 
					}else{
						if(is_in[0]){
							bless_time[id] = time - in_time[id];
						}
						is_in[id] = false;
						in_time[id] = Integer.MAX_VALUE;
					}
				}
			}
			
			int max_time = 0;
			for(int i = 0; i < ID_MAX; i++){
				max_time = Math.max(max_time, bless_time[i]);
			}
			System.out.println(max_time);
			
		}
		
	}

}