import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String str = br.readLine();
    	final int H = Integer.parseInt(str.split(" ")[0]);
    	final int W = Integer.parseInt(str.split(" ")[0]);
    	str = br.readLine();
    	final int h = Integer.parseInt(str.split(" ")[0]);
    	final int w = Integer.parseInt(str.split(" ")[0]);

    	
		if (H == h || W == w) {
			System.out.println(0);
    	} else {
    		System.out.println((H - h) * (W - w));
    	}
	}
}
