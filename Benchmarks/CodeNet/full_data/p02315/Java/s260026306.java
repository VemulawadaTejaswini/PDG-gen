import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		String str = BR.readLine();
		String [] arr = str.split("\\s+");
		int an = Integer.parseInt(arr[0]);
		int mw = Integer.parseInt(arr[1]);
		
		int[] values = new int[an];
		int[] weights = new int[an];
		for (int i = 0;i<an;i++){
			String temp = BR.readLine();
			String [] temparr = temp.split("\\s+");
			int tv = Integer.parseInt(temparr[0]);
			int tw = Integer.parseInt(temparr[1]);
			values[i] = tv;
			weights[i] = tw;
		}
		
		int[][] Vtable = new int[an+1][mw+1];
		for (int i=1;i<an+1;i++){
			for (int j=1;j<mw+1;j++){
				if (j<weights[i-1]){
					Vtable[i][j] = Vtable[i-1][j];
				}else {
					Vtable[i][j] = Math.max(Vtable[i-1][j-weights[i-1]]+values[i-1],Vtable[i-1][j]);
				}
			}
		}
		System.out.println(Vtable[an][mw]);
		BR.close();
	}
}