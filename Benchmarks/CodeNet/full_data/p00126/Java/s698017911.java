import java.util.*;
import java.io.*;

public class Main {
	
	public void output(int[][] x){
		Set<Integer> wrong = new HashSet<Integer>();
		for(int i = 0; i < 9; i++){
			int[] save = new int[10];
			for(int j = 0; j < 9; j++){
				if( save[x[i][j]] == 0 ){
					save[x[i][j]] = j+1;
				} else {
					wrong.add(i*9+j);
					wrong.add(i*9+save[x[i][j]]-1);
				}
			}
		}
		for(int i = 0; i < 9; i++){
			int[] save = new int[10];
			for(int j = 0; j < 9; j++){
				if( save[x[j][i]] == 0 ){
					save[x[j][i]] = j+1;
				} else {
					wrong.add(j*9+i);
					wrong.add((save[x[j][i]]-1)*9+i);
				}
			}
		}
		for(int i = 0; i < 9; i += 3){
			for(int j = 0; j < 9; j += 3){
				int[] save = new int[10];
				for(int k = 0; k < 3; k++){
					for(int l = 0; l < 3; l++){
						if( save[x[i+k][j+l]] == 0 ){
							save[x[i+k][j+l]] = (i+k)*9+j+l+1;
						} else {
							wrong.add((i+k)*9+(j+l));
							wrong.add(save[x[i+k][j+l]]-1);
						}
					}
				}
			}
		}
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				if( wrong.contains(i*9+j) ){
					writer.print("*");
					wrong.remove(i*9+j);
				} else {
					writer.print(" ");
				}
				writer.print(x[i][j]);
			}
			writer.println();
		}
	}						
			
	public void solve() throws IOException{
		int n = nextInt();
		int[][][] map = new int[n][9][9];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < 9; j++){
				for(int k = 0; k < 9; k++){
					map[i][j][k] = nextInt();
				}
			}
		}
		output(map[0]);
		for(int i = 1; i < n; i++){
			writer.println();
			output(map[i]);
		}
		writer.flush();
	}
		
	public static void main (String args[]) throws IOException{
		new Main().run();
	}
		
	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;
	
	public void run() throws IOException{
		try{
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			reader.close();
			writer.close();
		} catch (Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}
	public int nextInt() throws IOException{
		return Integer.parseInt(nextToken());
	}
	public String nextToken() throws IOException{
		while( tokenizer == null || !tokenizer.hasMoreTokens() ){
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
}