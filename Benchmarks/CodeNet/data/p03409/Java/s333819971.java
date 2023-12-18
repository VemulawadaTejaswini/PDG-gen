import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int red[][] = new int[N][2];
		int blue[][] = new int[N][2];
		for(int i = 0; i < N; i++) {
			red[i][0] = sc.nextInt();
			red[i][1] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			blue[i][0] = sc.nextInt();
			blue[i][1] = sc.nextInt();
		}
		
		Arrays.sort(blue, Comparator.comparingInt(o -> o[0]));
		int ans = 0;
		int used[] = new int[N];
		Arrays.fill(used, 0);
		for(int i = 0; i < N; i++) {
			int max_red_y = -1;
			int red_num = -1;
			in : for(int j = 0; j < N; j++) {
				if(used[j] == 1) continue in;
				if(blue[i][0] > red[j][0] && blue[i][1] > red[j][1]) {
					if(max_red_y < red[j][1]) {
						max_red_y = red[j][1];
						red_num = j;
					}
				}
			}
			if(red_num != -1) {
				used[red_num] = 1;
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}
