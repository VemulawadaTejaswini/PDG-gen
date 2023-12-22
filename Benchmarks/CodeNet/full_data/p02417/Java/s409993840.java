import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// A 65 Z 90 a 97 z 122
	    int x;
	    int y[] = new int[123];
	    String inputed="";
	    	try {
	    		inputed = br.readLine();
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    	}
		for(int i = 0; i < inputed.length(); i++){
			x = (int) inputed.charAt(i);
			y[x] +=1;
		}
		for(int j = 97; j < 123; j++){
			System.out.println((char) j + " : " + (y[j] + y[j-32]));
		}
	}
}

