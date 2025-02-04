import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args){
		BufferedReader reader = 
		new BufferedReader(new InputStreamReader(System.in));
		
		String[] bit = new String[10];
		bit[0] = "0111111";
		bit[1] = "0000110";
		bit[2] = "1011011";
		bit[3] = "1001111";
		bit[4] = "1100110";
		bit[5] = "1101101";
		bit[6] = "1111101";
		bit[7] = "0100111";
		bit[8] = "1111111";
		bit[9] = "1101111";
		
		int n,x;
		String[] segment = new String[2];
		
		while(true){
			try{
				n = Integer.parseInt(reader.readLine());
				if(n == -1)break;
				
				segment[0] = "0000000";
				
				for(int i = 0; i < n; i++){
					
					segment[1] = "";
					x = Integer.parseInt(reader.readLine());
					
					for(int j = 0; j < 7; j++)
						segment[1] += String.valueOf(
								Integer.parseInt(String.valueOf(segment[0].charAt(j))) ^
							    Integer.parseInt(String.valueOf(bit[x].charAt(j))));
					
					System.out.println(segment[1]);
					segment[0] = segment[1];
				}
			}catch(IOException e){
			}
		}
		
		try{
			reader.close();
		}catch(IOException e){
		}
}
}