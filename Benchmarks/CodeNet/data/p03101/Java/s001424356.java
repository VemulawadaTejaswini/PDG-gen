

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
//import org.apache.commons.lang3.StringUtils;
 
 
/**
 *
 * @author aj
 */
public class WhiteCells {
    
    public static void main(String[] args){
        try {
            //Scanner sc = new Scanner(System.in);
            BufferedInputStream bf = new BufferedInputStream(System.in);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(bf, StandardCharsets.UTF_8));
            OutputStream out = new BufferedOutputStream ( System.out );
            String[] HW = in.readLine().split(" ");
            String[] hw = in.readLine().split(" ");
            int H = Integer.parseInt(HW[0]);
            int W = Integer.parseInt(HW[1]);
            int h = Integer.parseInt(hw[0]);
            int w = Integer.parseInt(hw[1]);
            int r = H*W - ( h*(W-w) + h*w + w*(H-h));
            out.write((r+"\n").getBytes());
            out.flush();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    
    
}