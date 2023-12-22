import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int n = Integer.parseInt(std.next());
		int m = Integer.parseInt(std.next());
		int l = Integer.parseInt(std.next());

		int mat_a[][] = new int[n][m];
		for(int i=0; i<n; i++){
			for (int j=0; j<m; j++){
				mat_a[i][j] = Integer.parseInt(std.next());
			}
		}

		int mat_b[][] = new int[m][l];
		for(int j=0; j<m; j++){
			for (int k=0; k<l; k++){
				mat_b[j][k] = Integer.parseInt(std.next());
			}
		}

//		int mat_c[][] = new int[n][l];
		for(int i=0; i<n; i++){
			String line = "";
			for (int k=0; k<l; k++){
				long sum = 0;
				for(int j=0; j<m; j++){
					sum += mat_a[i][j] * mat_b[j][k];
				}
				if(k!=0){line += " ";}
				line += sum;
			}
			System.out.println(line);
		}
	}
}