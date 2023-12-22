import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main{
	public static void main(String[] args){
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		
		int n = 0;
		String[] str = null;
		String text;
		
		try{
			n = Integer.parseInt(reader.readLine());
		}catch(IOException e){
		}
		for(int i = 0; i < n; i++){
			
			text = "";
			try{
				str = reader.readLine().split(" ");
			}catch(IOException e){
			}
			for(int j = 0; j < str.length; j++){
				if(str[j].equals("Hoshino"))
					str[j] = "Hoshina";
				
				text += str[j];
				if(j != str.length - 1)
					text += " ";
				else
					list.add(text);
			}
		}
		for(int i = 0; i < n; i++)
			System.out.println(list.get(i));
		
		try{
			reader.readLine();
		}catch(IOException e){
		}
	}
}