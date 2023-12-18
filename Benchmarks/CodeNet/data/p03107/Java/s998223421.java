import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

    	try(BufferedReader i = new BufferedReader(new InputStreamReader(System.in))){

    		String S = i.readLine();
    		int a = S.length();
    		Long r = S.chars().parallel().filter(c -> c=='0').count();
    		Long b = a - r;
	    	System.out.println(Math.min(r, b) * 2);
    	}
    }
}