import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
    	try {
    		InputStreamReader isr = new InputStreamReader(System.in);
    		BufferedReader br = new BufferedReader(isr);
    		String buf = br.readLine();
    		int S = Integer.parseInt(buf);
    		if(0 <= S && S < 86400){
    		
    		int h=S/3600;
    		
    		int m=(S%3600)/60;
    		
    		int s=(S%3600)%60;
    		
    		System.out.println(h+":"+m+":"+s);
    		}
    	} catch(IOException e) {
		    System.err.println(e);
		}
    }
}