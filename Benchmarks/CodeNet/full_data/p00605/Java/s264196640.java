import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

class Main{
	static Scanner s;

	public static void main(String args[]){
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = new Scanner(System.in);
		try{
			while(true){
				int n = s.nextInt();
				int k = s.nextInt();
				if(n + k == 0) return;

				System.out.println(solve(n, k));
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}

	static String solve(int n, int k){
		int supply_array[] = new int[k];
		int demand_matrix[][] = new int[n][k];

		for(int i = 0; i < k; i++){
			supply_array[i] = s.nextInt();
		}
		//print(supply_array);

		for(int i = 0; i < n; i++){
			for(int j = 0; j < k; j++){
				demand_matrix[i][j] = s.nextInt();
			}
		}
		//print(demand_matrix);

		for(int i = 0; i < k; i++){
			int demand_sum = 0;
			for(int j = 0; j < n; j++){
				demand_sum += demand_matrix[j][i];
			}
			//System.out.println("demand: " + demand_sum + "\t supply: " + supply_array[i]);
			if(demand_sum > supply_array[i]) return "NO";
		}
		return "YES";
	}

	static void print(int a[]){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}

	static void print(int m[][]){
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
}