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
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> player = new ArrayList<Integer>();
		String line;
		
		while((line = in.readLine()) != null){
			String[] tmp = line.split(" ");
			int m = Integer.parseInt(tmp[0]);
			int n = Integer.parseInt(tmp[1]);
			
			if(m==0 && n==0) break;
			
			for(int i=0; i<m; i++){
				player.add(i);
			}
			
			int turn = 0;
			for(int i=1; i<=n; i++){
				line = in.readLine();
				if(player.size() == 1){
					continue;
				}
				
				if(i%15==0){
					if(!line.equals("FizzBuzz")){
						player.remove(turn);
						turn--;
					}
				}
				else if(i%5==0){
					if(!line.equals("Buzz")){
						player.remove(turn);
						turn--;
					}
				}
				else if(i%3==0){
					if(!line.equals("Fizz")){
						player.remove(turn);
						turn--;
					}
				}
				else{
					if(!line.equals(Integer.toString(i))){
						player.remove(turn);
						turn--;
					}
				}
				
				turn++;
				if(turn >= player.size()){
					turn %= player.size();
				}
			}
			
			for(int i=0; i<player.size(); i++){
				System.out.print(player.get(i)+1);
				if(i!=player.size()-1){
					System.out.print(" ");
				}
			}
			System.out.println();
			player.clear();
		}
	}
}