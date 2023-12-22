import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		for(int i = 1; ; i++){
		    try {
			    input = br.readLine();
		        
		    } catch (IOException e) {
	    	}
		    int x = Integer.parseInt(input);
	    	if(x == 0){
    		    break;
	    	}   
		    System.out.println("Case " +  i + ": " + x );
		}
	}
}
