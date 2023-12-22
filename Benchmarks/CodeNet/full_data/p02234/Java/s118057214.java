
import java.util.*;
import java.io.*;
 
public class Main {
 
	static int[][] products;
	static int[] rows;
	static int[] columns;
 
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
		int n = Integer.parseInt(reader.readLine());
		products = new int[n][n];
 
		rows = new int[n];
		columns = new int[n];
 
		for (int i=0; i<n; i++) {
			String line = reader.readLine();
			rows[i] = Integer.parseInt(line.substring(0,line.indexOf(" ")));
			columns[i] = Integer.parseInt(line.substring(line.indexOf(" ")+1));
		}
 
		System.out.println(calc(0,n-1));
 
		
	}
 
	static int calc(int x,int y){
		if (x-y == 1)
			return products[x][y] = rows[x] * columns[x] * columns[y];
		
		if (products[x][y] != 0 || x==y)
			return products[x][y];
		
		int minimum = Integer.MAX_VALUE;
		for (int a=x; a<y; a++){
			minimum = Math.min(minimum, calc(x,a) + calc(a+1,y) + rows[x] * rows[a+1] * columns[y]);
		}
		return products[x][y] = minimum;
	}
}


