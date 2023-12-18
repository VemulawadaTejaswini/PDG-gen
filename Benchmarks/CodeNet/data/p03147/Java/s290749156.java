
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
//import org.apache.commons.lang3.StringUtils;
 
 
/**
 *
 * @author aj
 */
public class Main {
    
    public static void main(String[] args){
        try {
            //Scanner sc = new Scanner(System.in);
            BufferedInputStream bf = new BufferedInputStream(System.in);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(bf, StandardCharsets.UTF_8));
            OutputStream out = new BufferedOutputStream ( System.out );
            
            int n = Integer.parseInt(in.readLine());
            String[] sh = in.readLine().split(" ");
            int[] h = new int[n];
            for(int i=0;i<n;i++) h[i] = Integer.parseInt(sh[i]);
            int sum = h[0];
            for(int i=1;i<n;i++){
                if (h[i]>h[i-1]) sum += (h[i] - h[i-1]);
            }
            out.write((sum+"\n").getBytes());
            out.flush();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}