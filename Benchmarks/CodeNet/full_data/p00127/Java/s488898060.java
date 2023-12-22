import java.util.*;
import java.io.*;

public class Main {
	
	public char[][] code = {{'a', 'f', 'k', 'p', 'u', 'z'}, {'b', 'g', 'l', 'q', 'v', '.'}, {'c', 'h', 'm', 'r', 'w', '?'},
						{'d', 'i', 'n', 's', 'x', '!'}, {'e', 'j', 'o', 't', 'y', ' '}};
	
	public boolean judge(String str){
		if( str.length() %2 != 0 ){
			return false;
		}
		for(int i = 0; i < str.length(); i += 2){
			if( str.charAt(i)-'0' > 7 ){
				return false;
			}			
		}
		for(int i = 1; i < str.length(); i += 2){
			if( str.charAt(i)-'0' > 6 ){
				return false;
			}
		}
		return true;
	}
	public void solve() throws IOException{
		while( stdIn.hasNext() ){
			String str = stdIn.next();
			if( !judge(str) ){
				writer.println("NA");
			} else {				
				for(int i = 0; i < str.length(); i += 2){
					int x = str.charAt(i)-'1';
					int y = str.charAt(i+1)-'1';
					writer.print(code[y][x]);
				}
				writer.println();
			}			
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