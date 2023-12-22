import java.io.*;
public class Main {
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String[] str = br.readLine().split(" ");
			int H = Integer.parseInt(str[0]);
			int W = Integer.parseInt(str[1]);
			if(H==0 && W==0)break;
		
			
			for(int j=0; j<W; j++){
			
				for(int i=0; i<H; i++){
					System.out.print("#");
				}
				System.out.print("\n");
			}
		}
	}

}