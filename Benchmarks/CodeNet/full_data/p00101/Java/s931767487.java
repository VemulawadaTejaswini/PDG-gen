import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<String> Ans = new ArrayList<String>();
		String line = in.readLine();
		
		int size = Integer.parseInt(line);
		for(int n=0; n<size; n++){
			line = in.readLine();
			while(line.contains("Hoshino")){
				line = line.replace("Hoshino", "Hoshina");
			}
			Ans.add(line);
		}
		
		for(int n=0; n<Ans.size(); n++){
			System.out.println(Ans.get(n));
		}
		
	}
}