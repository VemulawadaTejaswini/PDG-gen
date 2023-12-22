import java.util.*;
import java.io.*;

public class Main {
	
	public void sort(int[][] data){
	/*	int max = 0;
		for(int i = 0; i < data.length; i++){
			if( data[i][2] > data[max][2] ){
				max = i;
			}
		}
		for(int j = 0; j < 3; j++){
			int temp = data[max][j];
			data[max][j] = data[data.length-1][j];
			data[data.length-1][j] = temp;
		}*/
		
		int max = 0;
		int min = 0;
		int sum = 0;
		for(int i = 0; i < data.length; i++){
			sum += data[i][1];
			if( data[i][1] > data[max][1] ){
				max = i;
			} else if( data[i][1] < data[min][1] ){
				min = i;
			}
		}
		boolean size = ((double)sum/data.length > (double)(max+min)/2) ? true : false;
		if( !size ){
			for(int i = 0; i < data.length; i++){
				int m = i;
				for(int j = i+1; j < data.length; j++){
					if( data[j][1] < data[m][1] ){
						m = j;
					}
				}
				for(int j = 0; j < 3; j++){
					int temp = data[m][j];
					data[m][j] = data[i][j];
					data[i][j] = temp;
				}
			}
		} else {
			for(int i = 0; i < data.length; i++){
				int m = i;
				for(int j = i+1; j < data.length; j++){
					if( data[j][1] > data[m][1] ){
						m = j;
					}
				}
				for(int j = 0; j < 3; j++){
					int temp = data[m][j];
					data[m][j] = data[i][j];
					data[i][j] = temp;
				}
			}
		}
	}
	public int[] nextPermutation(int[] x, int index){
		int max = index;
		boolean[] temp = new boolean[x.length];
		for(int i = index; i < x.length; i++){
			temp[x[i]-1] = true;
			if( x[i] > x[max] ){
				max = i;
			}
		}
		int key = index+1;
		if( max == index ){
			for(; index > 0; index--){
				temp[x[index-1]-1] = true;
				if( x[index] > x[index-1] ){
					break;
				}
			}
			key = index;
		} 

		for(int i = x[key-1]; i < temp.length; i++){
			if( temp[i] ){
				x[key-1] = i+1;
				temp[i] = false;
				break;
			}
		}		
		int count = 0;
		for(int i = 0; i < temp.length; i++){
			if( temp[i] ){
				x[key+count] = i+1;
				count++;
			}
		}			
		return x;
	}
			
	public  void solve() throws IOException{
		int n = nextInt();
		long start = System.currentTimeMillis();
		int[][] data = new int[n][3];		
		for(int i = 0; i < n; i++){
			data[i][0] = nextInt();
			data[i][1] = nextInt();
			data[i][2] = nextInt();			
		}
		sort(data);	
		for(int[] y :data){
			writer.println(y[0] + " " + y[1] + " " + y[2]);
		}	
		int[] x = new int[n];
		for(int i = 0; i < x.length; i++){
			x[i] = i+1;
		}
		double min = 1000000001;
		int[] ans = new int[n];
		System.arraycopy(x, 0, ans, 0, n);
		int count = 0;
		int repeat = 1000000;
		while( x[0] != n && repeat-- > 0 ){
			count++;
			int[] total = new int[n];
			int high = data[x[n-1]-1][1];
			int low = high;
			for(int i = n-2; i >= 0; i--){
				int a = data[x[i]-1][1];		
				high = Math.max(high, a);
				low = Math.min(low, a);
				total[i] = high-low+Math.min(high-a, a-low);
			//	total[i] = high-low;
			}		
			double sum = 0;
			double w = 0;
			double v = (double)2000/70;	
			int i = 0;		
			for(; i < x.length-1; i++){
				if( sum + total[i]/v > min ){
	//				writer.println("cut at " + i + ", v = " + v + ", sum = " + sum);
					sum = min;
					break;
				}
				int len = Math.abs(data[x[i]-1][1]-data[x[i+1]-1][1]);
				w += 20*data[x[i]-1][2];
				v = 2000/(70+w);
				sum += len/v;								
			}
			if( sum < min ){
				System.arraycopy(x, 0, ans, 0, n);
				min = sum;
			}
			i = Math.min(i, n-1);
			x = nextPermutation(x, i);			
		}
		writer.println(count);
		writer.println(min);
		writer.print(data[ans[0]-1][0]);
		for(int i = 1; i < n; i++){
			writer.print(" " + data[ans[i]-1][0]);
		}
		writer.println();	
		long fin = System.currentTimeMillis();
		writer.println(fin-start);	
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