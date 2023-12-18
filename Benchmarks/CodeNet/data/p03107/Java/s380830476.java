import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

    	try(BufferedReader r = new BufferedReader(new InputStreamReader(System.in))){

    		String S = r.readLine();
    		int all = S.length();
    		Long red = S.chars().parallel().filter(c -> c=='0').count();
    		Long blue = all - red;
	    	System.out.println(Math.min(red, blue) * 2);
    	}
    }
}