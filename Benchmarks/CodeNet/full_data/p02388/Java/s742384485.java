import java.io.*;

class Cubic{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int x = Intger.parseInt(str);
		System.out.println(x*x*x);
	}
}