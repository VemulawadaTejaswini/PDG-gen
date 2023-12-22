import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main{
	public static void main(String[] args){
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, String> map = new HashMap<String, String>();
		
		String str = "";
		
		try{
		while((str = reader.readLine()) != null){
			String[] code = str.split(" ");
			
			if(map.containsKey(code[0]))
				map.put(code[0], map.get(code[0]) + " " + code[0]);
			else
				map.put(code[0], code[1]);
		}
		while((str = reader.readLine()) != null){
			map.get(str);
		}
		reader.close();
		}catch(IOException e){
		}
	}
}