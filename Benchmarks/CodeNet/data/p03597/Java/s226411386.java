import java.io.*;
import java.util.*;
class A{

	public static void main(String[]arg) throws IOException{
		new A().read();
	}

	public void read() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N,A;
		N = Integer.parseInt(in.readLine());
		A = Integer.parseInt(in.readLine());
		System.out.println(N*N - A);
	}
}