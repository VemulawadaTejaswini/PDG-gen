import java.io.*;
class Xcubic {
	static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       	String line = reader.readLine();
       	int x = Integer.parseInt(line);
       	int y = (x * x * x);
       	System.out.println(y);
       }
    }