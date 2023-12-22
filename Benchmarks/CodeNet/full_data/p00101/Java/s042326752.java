import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args){
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = null;
		
		try{
		int n = Integer.parseInt(reader.readLine());
		
		for(int i = 0; i < n; i++){
			str = reader.readLine().split("[\\s]+");
			for(int j = 0; j < str.length; j++)
				if(str[j].equals("Hoshino"))
					str[j] = "Hoshina";
		
		for(int j = 0; j < str.length; j++){
			System.out.print(str[j]);
			if(j != str.length - 1)System.out.print(" ");
			else System.out.println();
		}
		}
		reader.close();
		}catch(IOException e){
		}
	}
}