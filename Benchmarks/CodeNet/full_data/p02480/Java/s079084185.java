import java.io.*;
class Main{
	public static void main(String[] args) throws IOException
	{
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		String str = a.readLine();
			int x = Integer.parseInt(str);
			x = x*x*x;
			System.out.println(x);
	}
}