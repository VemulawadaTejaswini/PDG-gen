import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line = br.readLine()) != null) {
			line = line.trim();
			String answer = "";

			int value = Integer.parseInt(line);
			for(int i = 0; i < 10; i++){
	    		if((value & (1 << i)) != 0) {
	    			answer += (1 << i) + " ";
	    		}
	    	}
			
			answer = answer.trim();
			System.out.println(answer);
	    }
	}
}