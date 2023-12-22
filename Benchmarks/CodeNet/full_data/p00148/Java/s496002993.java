import java.util.*;
import java.io.*;

public class Main {
	
	public  void solve() throws IOException{
		while( stdIn.hasNext() ){
			int n = stdIn.nextInt();
			StringBuilder ans = new StringBuilder("3C");
			int x = (n%39 != 0) ? n%39 : 39;
			if( x/10 == 0 ){
				ans.append("0");
			}
			ans.append(x);
			writer.println(ans);
			writer.flush();
		}
		writer.flush();				
	}
	public static void main (String args[]) throws IOException{
		new Main().run();
	}
	
	Scanner stdIn;
	PrintWriter writer;
	
	public void run() throws IOException{
		stdIn = null;
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			writer = new PrintWriter(System.out);
			solve();
			stdIn.close();
			writer.close();
		} catch (Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}	
}