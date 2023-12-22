import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int[][][] count = new int[4][3][10];
		
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				for(int k=0; k<10; k++){
					count[i][j][k] = 0;
				}
			}
		}
		for(int i=0; i<n; i++){
			String[] line = br.readLine().split(" ");
			int b = Integer.parseInt(line[0]) - 1;
			int f = Integer.parseInt(line[1]) - 1;
			int r = Integer.parseInt(line[2]) - 1;
			int v = Integer.parseInt(line[3]);
			count[b][f][r] += v;
		}
		
		for(int i=0; i<4; i++){
			if(i != 0){
				System.out.println("####################");
			}
			for(int j=0; j<3; j++){
				for(int k=0; k<10; k++){
					System.out.print(" ");
					System.out.print(count[i][j][k]);
				}
				System.out.println();
			}
		}
	}
}