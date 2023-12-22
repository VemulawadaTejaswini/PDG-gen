import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		int x = 1;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 1; ; i++){
			x = Integer.parseInt(read.readLine());
			if (x == 0){
				break;
			}
			System.out.println("Case " + i + ": " + x);
		}
	}
}