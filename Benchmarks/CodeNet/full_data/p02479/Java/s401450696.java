import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			float r = Float.parseFloat(line);
			System.out.println((float)(r*r*Math.PI)+" "+(float)(2*r*Math.PI));
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("??°????????£????????????");
		}
	}
}