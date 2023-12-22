import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long answer = 1;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        long n = Integer.parseInt(s);
        answer = n/5;
		System.out.println(answer);
		
	}
}