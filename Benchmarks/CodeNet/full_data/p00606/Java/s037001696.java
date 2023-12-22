import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			while(true){
				/* input */
				line = br.readLine();

				int n = Integer.parseInt(line);

				if(n==0) break;
				
				line = br.readLine();
				
				char s = line.split(" ")[0].charAt(0), t = line.split(" ")[1].charAt(0), b = line.split(" ")[2].charAt(0);
				
				/* processing */
				double ans = solve(n,s-'A',t-'A',b-'A');
				/* output */
				System.out.println(ans);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static double solve(int n, int s, int t, int b){
		if(n==0){
			if(s==t){
				return 1.0;
			} else {
				return 0.0;
			}
		} else {
			double ret = 0;
			ret += solve(n-1,s>2&&b!=s-3?s-3:s,t,b);
			ret += solve(n-1,s%3!=2&&b!=s+1?s+1:s,t,b);
			ret += solve(n-1,s<6&&b!=s+3?s+3:s,t,b);
			ret += solve(n-1,s%3!=0&&b!=s-1?s-1:s,t,b);
			
			return 0.25*ret;
		}
	}
}