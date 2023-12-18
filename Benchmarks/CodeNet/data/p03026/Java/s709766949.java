import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int edge[][] = new int[num][num];
		int index[] = new int[num];
		for(int i = 0; i < num; i ++) {
			index[i] = 0;
		}
		for(int i = 0; i < num - 1; i ++) {
			int tmp1 = sc.nextInt() - 1;
			int tmp2 = sc.nextInt() - 1;
			edge[tmp1][index[tmp1]] = tmp2;
			index[i] ++;
			edge[tmp2][index[tmp2]] = tmp1;
			index[i] ++;
		}
		for(int i = 0; i < num; i ++) {
			index[i] ++;
			edge[i][index[i]] = -1;
		}

		int point[] = new int[num];
		long sum = 0;
		int max = 0;
		for(int i = 0; i < num; i ++) {
			point[i] = sc.nextInt();
			sum += point[i];
			max = Math.max(max, point[i]);
		}
		sum -= max;
		Arrays.sort(point);

		int deep[][] = new int[num][3];
		for(int i = 0; i < num; i ++) {
			deep[i][0] = num + 1000;
			deep[i][1] = i + 1;
			deep[i][2] = 0;
		}
		deep[0][0] = 0;
		boolean done[] = new boolean[num];
		for(int i = 0; i < num; i ++) {
			done[i] = false;
		}
		cal(num, deep, edge, done, 0);

		Arrays.sort(deep, (a, b) -> Integer.compare(b[0], a[0]));

		for(int i = 0; i < num; i ++) {
			deep[i][2] = point[i];
		}

		Arrays.sort(deep, (a, b) -> Integer.compare(a[1], b[1]));

		System.out.println(sum);
		for(int i = 0; i < num; i ++) {
			System.out.print(deep[i][2]+" ");
		}
		System.out.println();
	}

	static public void cal(int num, int deep[][], int edge[][], boolean done[], int index) {
		for(int i = 0; i < num; i ++) {
				if(edge[index][i] == -1 || done[index]) { return; }
				deep[edge[index][i]][0] = Math.min(deep[edge[index][i]][0],
				                                   deep[index][0] + 1);
		}
		done[index] = true;
		for(int i = 0; i < num; i ++) {
			if(edge[index][i] == -1) { return; }
			cal(num, deep, edge, done, edge[index][i]);
		}
	}
}