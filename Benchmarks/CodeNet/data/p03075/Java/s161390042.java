import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String str = br.readLine();
    	final int A = Integer.parseInt(str.split(" ")[0]);
    	final int B = Integer.parseInt(str.split(" ")[1]);
    	final int C = Integer.parseInt(str.split(" ")[2]);
    	final int D = Integer.parseInt(str.split(" ")[3]);
    	final int E = Integer.parseInt(str.split(" ")[4]);
    	final int K = Integer.parseInt(str.split(" ")[5]);
    	
    	boolean communicationAvailable = false;
    	
    	if (E - A <= K) {
    		communicationAvailable = true;
    	}
    	
    	if (communicationAvailable) {
    		System.out.println("Yay!");
    	} else {
    		System.out.println(":(");
    	}
    }
}