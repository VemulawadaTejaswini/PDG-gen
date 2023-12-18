

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ant_count = sc.nextInt();
		int circle_length = sc.nextInt();
		int time = sc.nextInt();
		int[] ant_positions = new int[ant_count];
		int[] ant_directions = new int[ant_count];

		for(int i = 0;i < ant_count;i++){
			ant_positions[i] = sc.nextInt();
			ant_directions[i] = sc.nextInt();
		}

		float t = time % circle_length;
		int cross_count = 0;
		int ant0_pos = ant_positions[0];
		int ant0_dir = ant_directions[0];
		int r_dir_count = 0;

		if(ant0_dir == 1){
			for(int i = 1;i < ant_count;i++){
				if(ant0_dir == ant_directions[i])continue;

				r_dir_count++;

				if(t <= 0.0f)continue;

				float len;
				len = ant_positions[i] - ant0_pos;

				float half = len / 2.0f;
				if(half <= t){
					cross_count++;
				}else{
					t = 0.0f;
				}
			}
		}else{
			for(int i = ant_count - 1;0 < i;i--){
				if(ant0_dir == ant_directions[i])continue;

				r_dir_count++;

				if(t <= 0.0f)continue;

				float len;
				len = ant0_pos + (circle_length - ant_positions[i]);

				float half = len / 2.0f;
				if(half <= t){
					cross_count++;
				}else{
					t = 0.0f;
				}
			}
		}

		for(int i = 0;i < ant_count;i++){
			if(ant_directions[i] == 1){
				ant_positions[i] += time;
			}else{
				ant_positions[i] -= time;
			}
			ant_positions[i] %= circle_length;
			if(ant_positions[i] < 0)
				ant_positions[i] += circle_length;
		}

		int ant0_id = ant0_dir == 1 ? cross_count : ant_count - cross_count;

		for(int i = 0;i < ant_positions.length;i++){
			int id = i - ant0_id;
			if(id < 0)id += ant_count;
			if(ant_count <= id)id -= ant_count;
			System.out.println(ant_positions[id]);
		}

		sc.close();
	}
}
