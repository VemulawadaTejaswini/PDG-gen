import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int num = Integer.parseInt(line);
		System.out.println((int)Math.pow(num,3));
	}
}		