

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
			int n=Integer.parseInt(br.readLine().trim());	
			for(int i=1;i<=n;i++) {
			System.out.println(algo(i));
			}
		
	}

	public static long algo(int n) {
		long res=0;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				for(int k=1;k<=n;k++) {
					int r=(i*i)+(j*j)+(k*k)+(i*j)+(j*k)+(i*k);
					if(r==n) {
						res++;
					}
				}
			}
		}
		
		
		
		
		return res;
	}
	
	
	
}
