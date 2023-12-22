import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] data = br.readLine().split(" ");
		
		int a = Integer.parseInt(data[0]);
		
		System.out.println((a/3600)+":"+(a%3600/60)+":"+(a%60)); 
	}
}