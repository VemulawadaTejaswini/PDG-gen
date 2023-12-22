import java.io.*;

class Main{
	public static void main(String[] args) {
		try{
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			String str = buf.readLine();
			int cubic = Integer.parseInt(str);
			System.out.println(cubic*cubic*cubic);
		}
		catch(IOException e){
			
		}
	}
}
