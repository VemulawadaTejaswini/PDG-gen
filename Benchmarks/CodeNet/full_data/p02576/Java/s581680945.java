

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(br.readLine());
	        int x = Integer.parseInt(br.readLine());
	        int t = Integer.parseInt(br.readLine());
	        
	        int ans=0;
	        while(n>0) {
	        	ans+=t;
	        	n=n>=x?n-x:0;
	        }
	        System.out.println(ans);
	        
	}

}
