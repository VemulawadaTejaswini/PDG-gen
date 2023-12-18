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

        int N = Integer.parseInt(val[0]);
        int A = Integer.parseInt(val[1]);
        int B = Integer.parseInt(val[2]);        
                        
        String rtn = null;

        if (A == B) {
            rtn = "1";
        } else if (A > B) {
            rtn = "0";
        } else if (N == 1) {
            rtn = "0";
//        } else if (N == 2) {
//            rtn = "1";
        } else {
            int c = (N-2)*(B-A) + 1;
            rtn = String.valueOf(c);
        }        
 
        return rtn;
    }        

}
