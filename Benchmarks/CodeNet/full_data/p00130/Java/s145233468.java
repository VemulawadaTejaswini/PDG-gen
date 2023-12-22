import java.util.*;
import java.io.*;

public class Main {
	
	public String formation(String str){
		LinkedList<Character> list = new LinkedList<Character>();
		list.add(str.charAt(0));
		int now = 0;
		for(int i = 3; i < str.length(); i += 3){
			if( str.charAt(i-1) == '>' ){
				now++;
			} else {
				now--;
			}
			if( now >= list.size() ){
				list.addLast(str.charAt(i));
			} else if( now < 0 ){
				list.addFirst(str.charAt(i));
				now = 0;
			}
		}
		StringBuilder ans = new StringBuilder();
		for(Character x : list){
			ans.append(x);
		}
		return ans.toString();
	}
	public void solve() throws IOException{
		int n = nextInt();
		for(int i = 0; i < n; i++){
			String str = nextToken();
			writer.println(formation(str));
		}
		writer.flush();
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