import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author 97797
 */
public class Main {
    public static void main(String[] args) throws IOException {

          System.out.println(new Main().run(args, System.in));
    }
    public String run(String[] args, InputStream in) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String[] val = reader.readLine().replaceAll("\\s+", " ").split(" ");

       long N = Long.parseLong(val[0]);
       long A = Long.parseLong(val[1]);
       long B = Long.parseLong(val[2]);        
                        
        String rtn = null;

        if (A == B) {
            rtn = "1";
        } else if (A > B) {
            rtn = "0";
        } else if (N == 1) {
            rtn = "0";
        } else if (N == 2) {
            rtn = "1";
        } else {
            long c = (N-2)*(B-A) + 1;
            rtn = String.valueOf(c);
        }        
 
        return rtn;
    }        

}
