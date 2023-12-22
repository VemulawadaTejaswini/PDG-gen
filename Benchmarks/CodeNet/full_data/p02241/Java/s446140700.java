import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] graph = new int[a][a];


		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j ++) {
				graph[i][j] = sc.nextInt();
			}
		}
		
		boolean[] visit = new boolean[a];
		
		int number = 1;
		int current;
		int val;
		int sum = 0;
		visit[0] = true;
		while(true) {
			val = 10000000;
			current = -1;
			
			for(int i = 0; i < a; i++) {
				if(visit[i] == true) {
					for(int j = 0; j < a; j++) {

						if(val > graph[i][j] && graph[i][j] >= 0 && visit[j] == false) {
			
							val = graph[i][j];
							//System.out.println("val updated:" + i + ":" + j + " = " + val);
							current = j;
						}
					}
				}	
			}
			//System.out.println(current);
			visit[current] = true;
			sum += val;
			number ++;
			if(number == a) break;
			
		}
		
		System.out.println(sum);

	}
}
