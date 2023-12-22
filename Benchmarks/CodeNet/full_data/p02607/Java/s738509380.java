

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
			int n=Integer.parseInt(br.readLine().trim());	
			String[] s=br.readLine().split(" ");
			int[] a=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(s[i].trim());
			}
			
			int res=0;
			for(int i=1;i<=n;i++) {
				if(i%2!=0 && a[i-1]%2!=0) {
					res++;
				}
			}
			System.out.println(res);
			
		
	}

}
