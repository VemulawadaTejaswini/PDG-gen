/**
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Neeraj
 *
 */
 class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[]a=new int[n];
		int i,count=0,j;
		String[]s=br.readLine().split("\\s");
		for(i=0;i<n;i++) {
			a[i]=Integer.parseInt(s[i]);
		}
		
		for(i=0;i<n-1;i++) {
			for(j=i+1;j<n;j++) {
				if(Math.abs(a[j]+a[i])==j-i)
					count++;
			}
		}
		
		System.out.println(count);
		
	}

}
