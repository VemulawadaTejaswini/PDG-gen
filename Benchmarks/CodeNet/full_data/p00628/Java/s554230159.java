import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args){
		Main myMain = new Main();
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		
		try{
		while(!((str = reader.readLine()).equals("END OF INPUT"))){
			String[] st = str.split(" ",0);
			
			System.out.println(myMain.Length(st));
		}
		reader.close();
		}catch(IOException e){
		}
	}
	
	public String Length(String[] str){
		String length = "";
		
		for(int i = 0; i < str.length; i++){
			length += String.valueOf(str[i].length());
		}
		
		return length;
	}
	
}