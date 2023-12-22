import java.io.*;

class Main {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int s =  Integer.parseInt(str);
		System.out.println(s*s*s);
	}	
}