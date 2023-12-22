/* Ohajiki Game */
import java.io.*;

public class Main{
	public static void main(String[] args){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line = in.readLine()) != null){
			int n = Integer.parseInt(line);
			if(n==0) break;
			line = in.readLine();
			String[] tmp = line.split(" ");
			int[] seq = new int[n];
			for(int i=0; i<n; i++){
				seq[i] = Integer.parseInt(tmp[i]);
			}
			
			int rest = 32;
			int idx = 0;
			while(rest > 0){
				rest -= (rest-1) % 5;
				System.out.println(rest);
				
				rest -= seq[idx];
				if(rest <= 0){
					System.out.println(0);
					break;
				}
				System.out.println(rest);
				
				idx = (idx+1)%n;
			}
		}
	}
}