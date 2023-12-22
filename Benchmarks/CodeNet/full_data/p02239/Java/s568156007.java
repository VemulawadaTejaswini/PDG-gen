import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

	static int n;

	static int[] v;

	static int[][] graph;

	static int time;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		graph = new int[n][n];

		v = new int[n];

		Arrays.fill(v, 0);

		for (int i = 0; i < n; i++) {
			String[] u_k_v = br.readLine().split(" ");

			int u = Integer.parseInt(u_k_v[0]);

			for (int k = 0; k < Integer.parseInt(u_k_v[1]); k++) {

				graph[u - 1][Integer.parseInt(u_k_v[2 + k]) - 1] = 1;

			}
		}

		another_search(0);


/*		for(int i=0; i<v.length; i++){
			System.out.println(v[i]);
		}*/

        for(int i = 0; i < n; i++){
        	if(!(i ==0)){
            System.out.println((i + 1) + " " + (v[i] == 0 ? "-1" : v[i]));
        }else {
			System.out.println((i+1)+" "+v[i]);
		}
        }


		/*
		 * for(int i=0; i<n; i++){ for(int k=0; k <n; k++){
		 * System.out.print(graph[i][k]);
		 *
		 * } System.out.println(""); }
		 */

	}

	static void another_search(int sx) {

		int j;

		v[sx] = 0;

		for (int i = 0; i < n; i++) {

			for (j = 0; j < n; j++) {

				if (graph[i][j] == 1 && v[j] == 0) {

					v[j] = ++v[j]+v[i];

				}

			}
		}

	}

}