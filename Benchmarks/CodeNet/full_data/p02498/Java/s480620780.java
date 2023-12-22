import java.io.*;
import java.util.*;

class Main {
	
	public void start() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		try {
			String str = input.readLine();
			StringBuilder x = new StringBuilder();
			for(int i=0; i<str.length(); i++) {
				if (Character.isUpperCase(str.charAt(i))) {
					x.append(Character.toLowerCase(str.charAt(i)));
				}
				else if (Character.isLowerCase(str.charAt(i))) {
					x.append(Character.toUpperCase(str.charAt(i)));
				}
				else {
					x.append(str.charAt(i));
				}
			}
			System.out.println(x);
		} catch(IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}
}