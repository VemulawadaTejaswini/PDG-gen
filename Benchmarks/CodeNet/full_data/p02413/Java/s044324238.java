import java.io.*;
import java.io.IOException;

class Main{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = new String[100];
		String output = "";
		int 	r,
				c;
		
		try{
			input = br.readLine().split("[\\s]+");
			r = Integer.parseInt(input[0]);
			c = Integer.parseInt(input[1]);
			int table[][] = new int[r+1][c+1];
		
		for(int y = 0;y < r;y++){
			input = br.readLine().split("[\\s]+");
			
			for(int x = 0;x < c;x++){
				table[y][x] = Integer.parseInt(input[x]);
				table[y][c] += table[y][x];
			}
		}
		
		for(int x = 0;x < c + 1;x++){
			for(int y = 0;y < r;y++){
				table[r][x] += table[y][x];
				
			}
			
		}
		
		for(int y = 0;y < r + 1;y++){
			for(int x = 0;x < c + 1;x++){
				output += table[y][x] + " ";
			}
			System.out.println(output.substring(0, output.length()-1));
			output = "";
		}
		}catch(IOException e){
			System.out.println(e);
			return;
		}
	}
}

