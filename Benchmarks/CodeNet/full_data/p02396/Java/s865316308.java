package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws Exception {
try {
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	String input = buf.readLine();
	int count = 0;
	while(input == "0"){
	System.out.println("Case " + count + ": " + input);
	input = buf.readLine();
	count ++;
	}
} catch (Exception e) {
	// TODO: handle exception
}
		 }
    }