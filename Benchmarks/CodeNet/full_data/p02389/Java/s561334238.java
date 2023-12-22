import java.io.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		String[] size = input.split(" ");
		int length  = Integer.parseInt(size[0]);	
		int height  = Integer.parseInt(size[1]);	
		System.out.println(length*height + " " + (length*2+height*2));

	}

}