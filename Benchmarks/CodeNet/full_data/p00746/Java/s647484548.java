import java.util.Scanner;
import java.util.Arrays;

public class Main{
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int tile_num = sc.nextInt();
			if(tile_num==0) break;
			int[] array_x = new int[tile_num];
			int[] array_y = new int[tile_num];

			for(int i=1; i<tile_num; i++){
				int num = sc.nextInt();
				int j = sc.nextInt();
				array_x[i] = array_x[num]+dx[j];
				array_y[i] = array_y[num]+dy[j];
			}
			Arrays.sort(array_x);
			Arrays.sort(array_y);

			int width = array_x[tile_num-1] - array_x[0] + 1;
			int height = array_y[tile_num-1] - array_y[0] + 1;

			System.out.println(width + " " + height);
		}
	}
}