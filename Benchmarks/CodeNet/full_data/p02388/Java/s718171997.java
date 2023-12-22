import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int intCount = 3;
		int intResult = 1;
		
		try {
			String strX = br.readLine();		
			try{
				//intに変換
				int intX = Integer.parseInt(strX);
				//int intX = 2;
				
				for(int i = 0; i<intCount; i++) {
					intResult = intResult*intX;
				}
				
				System.out.println(intResult);
				
			}catch (NumberFormatException e) {
				e.printStackTrace();
			}
			
			br.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}	
	}
}
