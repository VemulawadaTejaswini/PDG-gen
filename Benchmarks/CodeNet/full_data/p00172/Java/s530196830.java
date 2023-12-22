import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static class Doctor implements Comparable<Doctor>{
		int cur_room;
		int prev_room;
		int light_bit;
		int prev_bit;
		int time;
		
		public Doctor(int cur_room, int prev_room, int light_bit, int prev_bit, int time) {
			super();
			this.cur_room = cur_room;
			this.prev_room = prev_room;
			this.light_bit = light_bit;
			this.prev_bit = prev_bit;
			this.time = time;
		}

		@Override
		public int compareTo(Doctor o) {
			return this.time - o.time;
		}
	}
	
	public static final int SIZE = 15;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean[][] adj = new boolean[SIZE][SIZE];
		int[] room_switch_bit = new int[SIZE];
		int[][] prev_bit  = new int[SIZE][1 << SIZE];
		int[][] prev_room = new int[SIZE][1 << SIZE];
		
		while(true){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					adj[i][j] = i == j;
				}
			}
			
			for(int i = 0; i < m; i++){
				final int s = sc.nextInt() - 1;
				final int t = sc.nextInt() - 1;
				
				adj[s][t] = adj[t][s] = true;
			}
			
			int init_bit = 0;
			for(int i = 0; i < n; i++){
				final int bit = sc.nextInt();
				
				if(bit == 1){
					init_bit |= 1 << i;
				}
			}
			//System.out.println(Integer.toBinaryString(init_bit));
			
			Arrays.fill(room_switch_bit, 0);
			for(int i = 0; i < n; i++){
				final int k = sc.nextInt();
				
				for(int j = 0; j < k; j++){
					final int bit = sc.nextInt() - 1;
					
					room_switch_bit[i] |= 1 << bit;
				}
				//System.out.println(Arrays.toString(room_switch_bit));
			}
			
			
			for(int i = 0; i < SIZE; i++){
				Arrays.fill(prev_room[i], -2);
				Arrays.fill(prev_bit[i] ,  0);
			}
			
			PriorityQueue<Doctor> queue = new PriorityQueue<Main.Doctor>();
			queue.add(new Doctor(0, -1, init_bit, init_bit, 0));
			
			boolean ok = false;
			boolean can_goal = false;
			
			while(!queue.isEmpty()){
				Doctor doctor = queue.poll();
				
				if(prev_room[doctor.cur_room][doctor.light_bit] >= -1){
					continue;
				}else{
					prev_room[doctor.cur_room][doctor.light_bit] = doctor.prev_room;
					prev_bit[doctor.cur_room][doctor.light_bit] = doctor.prev_bit;
				}
				
				//System.out.println("time:" + doctor.time + " " + doctor.cur_room + " " + Integer.toBinaryString(doctor.light_bit));
				
				if(doctor.cur_room == n - 1){
					can_goal = true;
					
					if(doctor.light_bit == 1 << (n - 1)){
						ok = true;
						System.out.println("You can go home in " + doctor.time + " steps.");
						
						LinkedList<String> list = new LinkedList<String>();
						
						int cur_pos = doctor.cur_room;
						int cur_bit = doctor.light_bit;
						
						while(true){
							int prev_pos = prev_room[cur_pos][cur_bit];
							
							if(prev_pos < 0){
								break;
							}
							
							int before_bit = prev_bit[cur_pos][cur_bit];
							int changed_bit = cur_bit ^ before_bit;
							
							//System.out.println(cur_pos + " " + Integer.toBinaryString(cur_bit) + " " + Integer.toBinaryString(changed_bit));
							
							if(prev_pos != cur_pos){
								list.addFirst("Move to room " + (cur_pos + 1) + ".");
							}
							
							for(int keta = n - 1; keta >= 0; keta--){
								if((changed_bit & (1 << keta)) == 0){
									continue;
								}
								
								if((cur_bit & (1 << keta)) == 0){
									list.addFirst("Switch off room " + (keta + 1) + ".");
								}else{
									list.addFirst("Switch on room " + (keta + 1) + ".");
								}
							}
							
							cur_pos = prev_pos;
							cur_bit = before_bit;
						}
						
						for(String str : list){
							System.out.println(str);
						}
						
						break;
						//ok
					}
				}
				
				final int pattern = 1 << n;
				for(int next = 0; next < n; next++){
					if(!adj[doctor.cur_room][next]){
						continue;
					}
					
					for(int switch_bit = 0; switch_bit < pattern; switch_bit++){
						final int rest = (pattern - 1) - room_switch_bit[doctor.cur_room];
						
						if((rest & switch_bit) != 0){
							continue;
						}
						
						final int changed_bit = doctor.light_bit ^ switch_bit;
						
						//System.out.println(Integer.toBinaryString(changed_bit) + " " + Integer.toBinaryString(1 << next));
						
						if((changed_bit & (1 << doctor.cur_room)) == 0){
							continue;
						}
						
						if((changed_bit & (1 << next)) == 0){
							continue;
						}
						
						if(prev_room[next][changed_bit] >= -1){
							continue;
						}
						
						queue.add(new Doctor(next, doctor.cur_room, changed_bit, doctor.light_bit, doctor.time + Integer.bitCount(switch_bit) + (next == doctor.cur_room ? 0 : 1)));
					}	
				}
				
			}
			
			if(!ok){
				if(can_goal){
					System.out.println("You can not switch off all lights.");
				}else{
					System.out.println("Help me!");
				}
			}
			
		}
	}
}