import java.io.*;
import java.util.*;

class Main {	
	public void start() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
		try {
			String str = input.readLine();
			int x = Integer.parseInt(str);
			System.out.println(Math.pow(x,3));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}
}