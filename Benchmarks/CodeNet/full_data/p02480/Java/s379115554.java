import java.io.*;
public class Main{
	public static void main(String[] args){
		
		DataInputStream d = new DataInputStream(System.in);
		
		String s = d.readLine();
		
		int x = Integer.parseInt(s);
					
		System.out.println(x*x*x);
	}
}