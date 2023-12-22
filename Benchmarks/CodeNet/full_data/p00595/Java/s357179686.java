
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader scan = 
        		new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        String[] numArr;
        
        while((line = scan.readLine()) != null) {
        	
        	numArr = line.split(" ");
            
        	System.out.println
        	(gcdHelper(Integer.parseInt(numArr[0]), 
        			   Integer.parseInt(numArr[1])));
        }
        scan.close();
    }

    private static int gcdHelper(int x, int y) {
        if(y == 0) {
        	return x;
        } else {}
        return gcdHelper(y, x % y);
    }
}
