import java.util.*;
public class Main {
	static long dist[] = new long[100010];
	static int connect[][] = new int[100010][2];
	static int point;
	static int side;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		point = sc.nextInt();
		side = sc.nextInt();
		for(int i = 0; i < side; i ++) {
			connect[i][0] = sc.nextInt() - 1;
			connect[i][1] = sc.nextInt() - 1;
		}

		for(int i = 0; i < point; i ++) {
			dist[i] = -1;
		}

		long max = 0;
		for(int i = 0; i < point; i ++) {
			max = Math.max(max, get(i));
		}
		System.out.println(max);
	}
	public static long get(int index) {
		if(dist[index] == -1) {
			dist[index] = 0;
			for(int i = 0; i < side; i ++) {
				if(connect[i][0] == index) {
					dist[index] = Math.max(dist[index], get(connect[i][1]) + 1);
				}
			}
		}
		return dist[index];
	}
}