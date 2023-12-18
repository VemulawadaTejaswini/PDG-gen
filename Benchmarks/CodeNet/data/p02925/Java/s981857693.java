import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i, j;
		String[] line;
		int[][] a = new int[n][n-1];
		int[] pointer = new int[n];
		for(i=0; i<n; i++){
			line = br.readLine().split(" ");
			for(j=0; j<n-1; j++)
				a[i][j] = Integer.parseInt(line[j])-1;
		}
		
		boolean flag = true;
		boolean[] flags;
		int dayCount = 0;
		while(flag){
			flag = false;
			flags = new boolean[n];
			for(i=0; i<n; i++){
				if( flags[i] || n-1 <= pointer[i] )
					continue;
				j = a[i][pointer[i]];
				if( flags[j] )
					continue;
				if( a[j][pointer[j]] == i ){
					flag = true;
					flags[i] = flags[j] = true;
					pointer[i]++;
					pointer[j]++;
				}
			}
			dayCount++;
		}
		
		for(i=0; i < n && n-1 <= pointer[i]; i++){}
		if( i < n )
			System.out.println("-1");
		else
			System.out.println(dayCount-1);
	}
}
