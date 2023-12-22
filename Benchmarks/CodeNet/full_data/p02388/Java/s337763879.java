import java.io.*;
public class Main {
	public static void main (String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			int x = Integer.parseInt(line);
			int tri = (int) Math.pow(x,3);
			System.out.println(tri);
		}catch(IOException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println("??°????????\?????????????????????");
		}
	}
}