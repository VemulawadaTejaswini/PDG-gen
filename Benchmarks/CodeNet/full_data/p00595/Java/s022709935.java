
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	 private static int gcdHelper(int x, int y) {
	        if(y == 0) {
	        	return x;
	        } else {}
	        return gcdHelper(y, x % y);
	    }
	 
    public static void main(String[] args) throws IOException {
        BufferedReader scan = 
        		new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        String[] numArr;
        
        while((line = scan.readLine()) != null) {
        	
        	numArr = line.split(" ");
            int out = gcdHelper(Integer.parseInt(numArr[0]), 
     			   Integer.parseInt(numArr[1]));
        	System.out.println(out);
        	
        }
        }

   
}
