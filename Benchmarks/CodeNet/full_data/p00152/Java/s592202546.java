import java.util.*;
import java.io.*;

public class Main {
	
	public void sort(int[][] x){
		for(int i = 0; i < x.length; i++){
			int max = i;
			for(int j = i+1; j < x.length; j++){
				if( x[max][1] < x[j][1] ){
					max = j;
				} else if( x[max][1] == x[j][1] ){
					if( x[max][0] > x[j][0] ){
						max = j;
					}
				}
			}
			for(int j = 0; j < 2; j++){
				int temp = x[max][j];
				x[max][j] = x[i][j];
				x[i][j] = temp;
			}
		}
	}
	public int score(int[] x){
		int sum = 0;
		int frame = 1;
		for(int i = 0; i < x.length; i++){  
			if( frame == 10 ){
				sum += x[i];
			} else {
				if( x[i] == 10 ){  // strike
					sum += x[i] + x[i+1] + x[i+2];
				} else if( (x[i] + x[i+1]) == 10 ){  // spare
					sum += x[i] + x[i+1] + x[i+2];
					i++;
				} else {
					sum += x[i] + x[i+1];
					i++;
				}
				frame++;
			}
		}
		return sum;
	}
				 
	public  void solve() throws IOException{
		int n;
		while( (n = stdIn.nextInt() ) != 0 ){
			stdIn.nextLine();
			String[][] s = new String[n][];
			for(int i = 0; i < n; i++){
				s[i] = stdIn.nextLine().split(" ");
			}
			int[][] data = new int[n][];
			for(int i = 0; i < n; i++){
				data[i] = new int[s[i].length-1];
				for(int j = 0; j < s[i].length-1; j++){
					data[i][j] = Integer.parseInt(s[i][j+1]);					
				}
			}
			int[][] ans = new int[n][2];
			for(int i = 0; i < n; i++){
				ans[i][0] = Integer.parseInt(s[i][0]);
				ans[i][1] = score(data[i]);
			}
			sort(ans);
			for(int[] x : ans){
				writer.println(x[0] + " " + x[1]);
			}
		}
		writer.flush();
	}
	public static void main (String args[]) throws IOException{
		new Main().run();
	}
	
	Scanner stdIn;
	PrintWriter writer;
	
	public void run() throws IOException{
		stdIn = null;
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			writer = new PrintWriter(System.out);
			solve();
			stdIn.close();
			writer.close();
		} catch (Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}	
}