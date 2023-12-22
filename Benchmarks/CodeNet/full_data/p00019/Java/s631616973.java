import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int answer = 0;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        int n = Integer.parseInt(s);
        for (int i = n; i > 0;i--){
        	answer = answer * i;
        }
		System.out.println(answer);
		
	}
}