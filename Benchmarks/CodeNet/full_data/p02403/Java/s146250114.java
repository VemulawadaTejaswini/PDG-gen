
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main { 
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
		String[] arr = br.readLine().split(" ");
		int h = Integer.parseInt(arr[0]);
		int w = Integer.parseInt(arr[1]);
		
		for(int i = 0;i<h;i++){
			
			
			for(int j = 0;j<w;j++){
				System.out.print("#");
				
			}
			System.out.println("");
		}
		System.out.println("");
		
		}
		
	}
	


}