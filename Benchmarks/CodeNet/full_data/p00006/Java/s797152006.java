import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str = in.readLine()) != null){
			StringBuffer reverse = new StringBuffer().append(str);
			System.out.print(reverse.reverse() + "\n");
		}
		
	}
}