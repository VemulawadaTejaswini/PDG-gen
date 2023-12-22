import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println((new Main()).fact(Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine())));}
	private long fact(long n){return (n==0)?1:n*fact(n-1);}
}