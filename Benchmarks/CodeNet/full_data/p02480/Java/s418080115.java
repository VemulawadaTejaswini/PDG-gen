import java.io.*;

public class Main {
    public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	    String line = reader.readLine();
	    int number = Integer.parseInt(line);
	    System.out.println(number*number*number);
	} catch (IOException e) {
	    System.out.println(e);
	} catch (NumberFormatException e) {
	    System.out.println(e);
	}
    }
}