import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<Integer, Integer[]> map = new HashMap<>();
		int[][] data = new int[m][4];
		for(int i = 0; i < m; i++) {
			data[i][0] = i;
			data[i][1] = sc.nextInt();
			data[i][2] = sc.nextInt();
			data[i][3] = 1;
		}
		Arrays.sort(data, (x,y) -> x[1] == y[1] ? x[2]-y[2] : x[1] - y[1]);
		for(int i = 1; i < m; i++) {
			if(data[i][1] == data[i-1][1])
				data[i][3] = data[i-1][3] + 1;
		}
		Arrays.sort(data, (x,y) -> x[0] - y[0]);
		for(int i = 0; i < m; i++) {
			System.out.printf("%06d%06d", data[i][1], data[i][3]);
			System.out.println();
		}
	}

}