import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		int[][] matrix = new int[amount][amount];
		int[] visited = new int[amount];
		int weight = 0;
		visited[0] = 0;
		
		for(int i = 1; i < amount; i++) {
			visited[i] = -1;
		}
		for(int i = 0; i < amount; i++) {
			for(int j = 0; j < amount; j++) {
				int num = input.nextInt();
				matrix[i][j] = num;
			}
		}
		for(int i = 0; i < amount; i++) {
			matrix[i][0] = -1;
		}
		input.close();
		int vertex = 0;
		int min = 2001;
		int x = 0;
		for(int i = 1; i < amount; i++) {
			while(visited[x] != -1) {
				for(int j = 0; j < amount; j++) {
					int compare = matrix[visited[x]][j];
					if(compare < min && compare != -1) {
						min = compare;
						vertex = j;
					}
				}
				x++;
			}
			weight += min;
			visited[i] = vertex;
			for(int k = 0; k < amount; k++) {
				matrix[k][vertex] = -1;
			}
		}
		System.out.println(weight);
	}
}
