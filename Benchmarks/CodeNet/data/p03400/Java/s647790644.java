
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String str = br.readLine().trim();
        
        int n = Integer.parseInt(str);
        str = br.readLine().trim();
        StringTokenizer stk = new StringTokenizer(str);
        int d = Integer.parseInt(stk.nextToken());
        int x = Integer.parseInt(stk.nextToken());
        int[] a = new int[n]; int total=n;
        for(int i=0;i<n;i++) {
        	a[i] = Integer.parseInt(br.readLine().trim());
        	if(a[i]==1) {
        		total+=(int)d/a[i];total--;
        	}
        	else total+=(int)((d-1)/(a[i]));
        	
        }
        System.out.println(total+x);
	}

}
