import java.util.*;
import java.io.*;
public class Main {
	public String simulate(char[] x, char[] y, char[] a){
		for(int i = 0; i <= 9; i++){
			StringBuilder left = new StringBuilder();
			StringBuilder right = new StringBuilder();
			StringBuilder ans = new StringBuilder();
			if( i == 0 ){
				if( (x.length > 1 && x[0] == 'X') || (y.length > 1 && y[0] == 'X') || (a.length > 1 && a[0] == 'X') ){
					continue;
				}
			}
			for(int j = 0; j < x.length; j++){
				left.append( (x[j] == 'X') ? i : x[j]-'0' );
			}
			for(int j = 0; j < y.length; j++){
				right.append( (y[j] == 'X') ? i : y[j]-'0' );
			}
			for(int j = 0; j < a.length; j++){
				ans.append( (a[j] == 'X') ? i : a[j]-'0' );
			}
			int p = Integer.parseInt(left.toString());
			int q = Integer.parseInt(right.toString());
			int r = Integer.parseInt(ans.toString());
		//	System.out.println(p + " " + q + " " + r);
			if( p+q == r ){
				return Integer.toString(i);
			}
		}
		return "NA";
	}
			
    public void solve() throws IOException{
    	Scanner stdIn = null;
    	try{
    		stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        	while( stdIn.hasNext() ){
            	String str = stdIn.next();
            	String[] s = str.split("=");
           	   	String[] t = s[0].split("\\+");
               	char[] x = t[0].toCharArray();
            	char[] y = t[1].toCharArray();
            	char[] a = s[1].toCharArray();
            	System.out.println(simulate(x, y, a));
       		}
       	} finally {
       		if( stdIn != null ){
       			stdIn.close();
       		}
       	}
    }
    public static void main (String args[]) throws IOException{
        new Main().run();
    }

    BufferedReader reader;
    StringTokenizer tokenizer;
    PrintWriter writer; 
    public void run() throws IOException{
        try{
            reader = new BufferedReader(new InputStreamReader(System.in));
            tokenizer = null;
            writer = new PrintWriter(System.out);
            solve();
            reader.close();
            writer.close();
        } catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
    public int nextInt() throws IOException{
        return Integer.parseInt(nextToken());
    }
    public String nextToken() throws IOException{
        while( tokenizer == null || !tokenizer.hasMoreTokens() ){
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }
} 