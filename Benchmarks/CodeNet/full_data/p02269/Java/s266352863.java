import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
   
public class Main {
    HashSet<String> hs = new HashSet<>();
    public static void main(String[] args) throws IOException {
//    	long l = System.currentTimeMillis();
        new Main().exec();
//    	long l2 = System.currentTimeMillis();
//    	System.out.println(l2 - l);
    }
      
    public void exec() throws IOException {
        InputUtil in = new InputUtil();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        for(int i=0; i<n; i++) {
        	String cmd = in.br.readLine();
        	if(cmd.charAt(0)=='i'){
        		hs.add(cmd.substring(7));
        	}else{
        		out.println(hs.contains(cmd.substring(5))?"yes":"no");
        	}
        }
        out.flush();
    }
}

class InputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String[] readStrArray(String delim) throws NumberFormatException, IOException{
    	return br.readLine().split(delim);
    }
    
    public int nextInt() throws NumberFormatException, IOException{
    	return Integer.parseInt(br.readLine());
    }

}