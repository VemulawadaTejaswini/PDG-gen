import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args){
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		
		try{
			int n = Integer.parseInt(reader.readLine());
			
		for(int i = 0; i < n; i++){
			
			String str = reader.readLine();
			
			str = str.replaceAll("Hoshino","Hoshina");
			
			System.out.println(str);
			
		}
		}catch(IOException e){
		}
	}
}