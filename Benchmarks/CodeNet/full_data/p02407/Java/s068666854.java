
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args)throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		String[] line2 = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(line1);
		int[] a = new int[n];
		
		int num = n;
		
		for(int i=0; i<n; i++){
			a[i] = Integer.parseInt(line2[num-1]);
			if((i == (n-1)) && (num == (n-i))){
				sb.append(a[i]+"\n");
			}	else{
				sb.append(a[i] +" ");
			}
			num--;
		}
		System.out.print(sb);
	}
}