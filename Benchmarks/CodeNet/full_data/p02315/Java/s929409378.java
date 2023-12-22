import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bag {
	public static void main(String[] args) throws IOException{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		String str = BR.readLine();
		
		int an = Integer.parseInt(str.substring(0,str.indexOf(" ")));
		int mw = Integer.parseInt(str.substring(str.indexOf(" ")+1));
		
		int[] values = new int[an];
		int[] weights = new int[an];
		for (int i = 0;i<an;i++){
			String temp = BR.readLine();
			int tv = Integer.parseInt(temp.substring(0,str.indexOf(" ")));
			int tw = Integer.parseInt(temp.substring(str.indexOf(" ") + 1));
			values[i] = tv;
			weights[i] = tw;
		}
		
		int[][] Vtable = new int[an][mw+1];
		for (int i=0;i<an;i++){
			for (int j=0;j<mw+1;j++){
				if (i==0&&j>=weights[0]){
					Vtable[i][j] = values[0];
				}else if(j-weights[i]>=0){
					Vtable[i][j] = Math.max(Vtable[i-1][j-weights[i]]+values[i],Vtable[i-1][j]);
				}
			}
		}
		System.out.println(Vtable[an-1][mw]);
		BR.close();
	}
}