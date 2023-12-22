import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public String[][] codes = new String[][]{
			{"a", "f", "k", "p", "u", "z"},
			{"b", "g", "l", "q", "v", "."},
			{"c", "h", "m", "r", "w", "?"},
			{"d", "i", "n", "s", "x", "!"},
			{"e", "j", "o", "t", "y", " "}
	};
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<String> Ans = new ArrayList<String>();
		String line;
		
		while((line = in.readLine()) != null){
			if(line.length() == 0) break;
			
			if(line.length()%2 == 1){
				Ans.add("NA");
				continue;
			}
			
			String msg = "";
			for(int n=0; n<line.length(); n+=2){
				String a = line.substring(n, n+1);
				String b = line.substring(n+1, n+2);
				int x = Integer.parseInt(a);
				int y = Integer.parseInt(b);
				try{
					msg += codes[y-1][x-1];
				}catch(ArrayIndexOutOfBoundsException e){
					msg = "NA";
					break;
				}
			}
			
			Ans.add(msg);
		}
		
		for(int n=0; n<Ans.size(); n++){
			System.out.println(Ans.get(n));
		}
	}
}