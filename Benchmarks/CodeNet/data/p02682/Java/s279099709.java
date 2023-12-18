import java.util.*;
import java.io.*;
public class Main
{
    
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().trim().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int c = Integer.parseInt(s[2]);
		int k = Integer.parseInt(s[3]);
		int ans = 0;
	    if(k >= a){
	        ans += a;
	        k -= a;
	    }
	    else{
	        ans = k;
	        k = 0;
	    }

	    if(k >= b){
	        k -= b;
	    }
	    else{
	        k = 0;
	    }
	
	    if(k >= c){
	        ans -= c;
	        k -= c;
	    }
	    else{
	        ans = ans-k;
	    }
	    System.out.println(ans);
	}
}

