import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int vertexes = in.nextInt();
		int[][] graph = new int[vertexes][vertexes];
		int[] in_msp = new int[vertexes];
		int total_weight = 0;
		
		// Make an array of vertexes in our MSP. Set to -1 if not in MSP yet. 0 starts in it.
		for(int i = 1; i < vertexes; i++) {
			in_msp[i] = -1;
		}
		
		// Take in initial graph
		for(int i = 0; i < vertexes; i++) {
			for(int j = 0; j < vertexes; j++) {
				graph[i][j] = in.nextInt();
			}
		}
		
		// Remove all connections in the graph to 0, our starting vertex
		for(int i = 0; i < vertexes; i++) {
			graph[i][0] = -1;
		}
		
		for(int i = 1; i < vertexes; i++) {
			int min_across_cut = 2001;
			int next_vert = 0;
			int j = 0;
			while(in_msp[j] != -1) {
				for(int k = 0; k < vertexes; k++) {
					if(min_across_cut > graph[in_msp[j]][k] && graph[in_msp[j]][k] != -1) {
						min_across_cut = graph[in_msp[j]][k];
						next_vert = k;
					}
				}
				j++;
			}
			total_weight += min_across_cut;
			in_msp[i] = next_vert;
			for(int k = 0; k < vertexes; k++) {
				graph[k][next_vert] = -1;
			}
		}
		
		System.out.println(total_weight);
		in.close();
	}

}

