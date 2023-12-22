
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long answer = 0;
		int count = 0;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        long n = Integer.parseInt(s);
        for (int i = 1; i <= 0;i++){
        	int buffer = 1;
        	while (buffer % 5 == 0){
        		buffer /= 5;
        		count++;
        	}
        }
		System.out.println(count);
		
	}
}