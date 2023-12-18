import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int K = Integer.parseInt(br.readLine());
        int L = line.length();
        
        for(int i=0;i<L-1;i++){
        	if(line.charAt(i)+K > 'z'){
        		K -= ('z'- line.charAt(i) + 1);
        		line = line.substring(0,i) + "a" + line.substring(1+i);
        	}
        }//lineChar[0]~[L-2] was set correctly
        K = K%26;
        char finalChar;
        if(line.charAt(L-1) + K > 'z') finalChar = (char)(line.charAt(L-1)+K-26);
        else finalChar = (char)(line.charAt(L-1)+K);
        line = line.substring(0,L-1) + finalChar;
        
        System.out.println(line);
    }
}