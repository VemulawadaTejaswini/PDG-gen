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
	
	int[][] offset = new int[][]{
			{-1, 0}, {1, 0}, {0, -1}, {0, 1}
	};


	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> Ans = new ArrayList<Integer>();
		String line;

		while((line = in.readLine()) != null){
			String[] dst = line.split(" ");
			int h = Integer.parseInt(dst[0]);
			
		}

		for(int n=0; n<Ans.size(); n++){
			System.out.println(Ans.get(n));
		}
	}

	
}