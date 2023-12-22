import java.io.*;

class Main{
	public void main(String[]args) throws IOException{

		int x;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf = br.readLine();
		x = Integer.parseInt（buf);

		System.out.println(x);
	}
}