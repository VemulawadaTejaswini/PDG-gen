import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line;
			while(true){
				line = reader.readLine();
				if(line.equals("0")){
					break;
				}
				int b, s = 0;
				for(int i = 0;i < line.length();i++){
					char a = line.charAt(i);
					b = Integer.parseInt("" + a);
					s = s + b;
				}
				System.out.println(s);
				
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}