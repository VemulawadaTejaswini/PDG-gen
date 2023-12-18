import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] data = new int[m][4];
		for(int i = 0; i < m; i++) {
			data[i][0] = i;
			data[i][1] = Integer.parseInt(sc.next());
			data[i][2] = Integer.parseInt(sc.next());
			data[i][3] = 1;
		}
		Arrays.sort(data, (x,y) -> x[1] == y[1] ? x[2]-y[2] : x[1] - y[1]);
		int a = 0;
		int b = 0;
		for(int i = 0; i < m; i++) {
			if(data[i][1] != a) {
				a = data[i][1];
				b = 0;
			}
			data[i][3] = ++b;
		}
		Arrays.sort(data, (x,y) -> x[0] - y[0]);
		for(int i = 0; i < m; i++) {
			System.out.printf("%06d%06d", data[i][1], data[i][3]);
			System.out.println();
		}
	}

}