import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		float[][] xy = new float[N][2];
		double sum = 0;

		for (int i = 0; i < N; i++) {
			xy[i][0] = Float.parseFloat(sc.next());
			xy[i][1] = Float.parseFloat(sc.next());
		}
		for(int i = 0; i < N - 1; i++) {
			for(int j = i+1; j < N; j++) {
				double length = Math.sqrt((xy[i][0] - xy[j][0]) * (xy[i][0] - xy[j][0]) + (xy[i][1] - xy[j][1]) * (xy[i][1] - xy[j][1]));
				sum += length;
			}
		}
		System.out.println(sum/N*2);
	}
}