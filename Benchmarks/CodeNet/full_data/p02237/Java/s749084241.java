import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int limit = in.nextInt();
		int[][] graph = new int[limit][limit];
		for(int i = 0; i < limit; i++) {
			int index = in.nextInt();
			int neighbors = in.nextInt();
			for(int j = 0; j < neighbors; j++) {
				graph[i][in.nextInt() - 1] = 1;
			}
		}
		in.close();
		for(int i = 0; i < limit; i++) {
			for(int j = 0; j < limit; j++) {
				if(j == limit - 1) {
					System.out.println(graph[i][j]);
				} else {
					System.out.print(graph[i][j] + " ");
				}
			}
		}
	}

}
