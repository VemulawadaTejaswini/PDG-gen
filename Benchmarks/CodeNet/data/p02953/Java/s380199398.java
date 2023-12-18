import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
	
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

			int n = Integer.parseInt(bf.readLine().trim());

			int p[] = new int[n+1];
			int i=1;
			
		    StringTokenizer st = new StringTokenizer(bf.readLine().trim());
		    while (st.hasMoreTokens()) {
		    	p[i] = Integer.parseInt(st.nextToken());
		    	i++;
		    }
		    
		    boolean ret = true;
		    for(i=n;i>1;i--) {
		    	if (p[i-1] <=p[i]) {
		    		continue;
		    	}else if (p[i-1]-1 == p[i]) {
		    		p[i-1]--;
		    	}else {
		    		ret = false;
		    		break;
		    	}
		    }
		    
		    if ( ret  ) {
		    	System.out.println("Yes");
		    }else{
		    	System.out.println("No");
		    }
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
}