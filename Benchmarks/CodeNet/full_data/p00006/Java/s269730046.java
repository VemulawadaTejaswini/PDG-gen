import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String line;
		while((line=br.readLine())!=null){
			StringBuffer reverse = new StringBuffer().append(line);
			System.out.print(reverse.reverse()+"\n");
		}
	}
}