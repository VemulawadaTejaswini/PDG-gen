import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String str = br.readLine();
    	char[] cArray = str.toCharArray();
    	int len = cArray.length;
    	for (int i = 0; i < len; i++) {
    		int b = (int)Character.toString(cArray[i]).getBytes()[0];
    		if (b >= 65 & b <= 90) {
    			cArray[i] = Character.toLowerCase(cArray[i]);
    		} else if (b >= 97 & b <= 122) {
    			cArray[i] = Character.toUpperCase(cArray[i]);
    		}
    	}
    	System.out.println(new String(cArray));
    }
}