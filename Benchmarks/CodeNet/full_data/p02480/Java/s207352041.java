import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			int num = Integer.parseInt(line);
			String result = "" + num*num*num;
			System.out.println(result);
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("??°????????£????????????");
		}
	}
}