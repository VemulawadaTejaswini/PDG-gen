import java.io.*;
import java.util.*;

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
		List<String> Ans = new ArrayList<String>();
		String line = in.readLine();
		
		int size = Integer.parseInt(line);
		for(int n=0; n<size; n++){
			line = in.readLine();
			int type = 0;
			
			String c = line.substring(0, 2);
			if(c.equals(">'")){
				int count = 0;
				int sharp = 0;
				for(int i=2; i<line.length(); i++){
					c = line.substring(i, i+1);
					if(c.equals("=")){
						count++;
					}
					else if(c.equals("#")){
						if(count > 0){
							count = -count;
							sharp = 1;
						}
						else{
							type = -1;
							break;
						}
					}
					else if(c.equals("~")){
						if(i != line.length()-1){
							type = -1;
							break;
						}
						
						if(count==0 && sharp==1){
							type = 1;
							break;
						}
						else{
							type = -1;
							break;
						}
					}
					else{
						type = -1;
						break;
					}
				}
			}
			else if(c.equals(">^")){
				int count = 0;
				for(int i=2; i<line.length(); i++){
					c = line.substring(i, i+1);
					if(count%2==0 && count>=2 && c.equals("~")){
						if(i==line.length()-1){
							type = -1;
							break;
						}
						
						c = line.substring(i+1, i+2);
						if(c.equals("~")){
							type = 2;
							break;
						}
						else{
							type = -1;
							break;
						}
					}
					if(i%2==0){
						if(!c.equals("Q")){
							type = -1;
							break;
						}
						count++;
					}
					if(i%2==1){
						if(!c.equals("=")){
							type = -1;
							break;
						}
						count++;
					}
					
					if(!c.equals("Q") && !c.equals("=") && !c.equals("~")){
						type = -1;
						break;
					}
				}
			}
			else{
				type = -1;
			}
			
			switch(type){
				case 1:
					Ans.add("A");
					break;
					
				case 2:
					Ans.add("B");
					break;
					
				default:
					Ans.add("NA");
			}
		}
		
		for(int n=0; n<Ans.size(); n++){
			System.out.println(Ans.get(n));
		}
	}
}