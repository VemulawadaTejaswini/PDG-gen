import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dim = sc.nextInt();
		long point[][] = new long[num][dim];
		for(int i = 0; i < num; i ++) {
			for(int j = 0; j < dim; j ++) {
				point[i][j] = sc.nextLong();
			}
		}

		long count = 0;
		for(int i = 0; i < num; i ++) {
			for(int j = i + 1; j < num; j ++) {
				double dist = 0;
				for(int k = 0; k < dim; k ++) {
					dist += Math.pow(point[i][k] - point[j][k], 2);
				}
				dist = Math.sqrt(dist);
				if(dist % 1 == 0) { count ++; }
			}
		}
		System.out.println(count);
	}
}