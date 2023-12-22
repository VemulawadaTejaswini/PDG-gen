
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author k16069kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null){
            java.util.StringTokenizer st = new StringTokenizer(line, " ");
            
            while(st.hasMoreTokens()){
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                if(a==b){
                    break;
                }else if(a < b){
                    System.out.println(a+" "+b);
                } else {
                    System.out.println(b+" "+a);
                } 
            }
        }
    }
    
}

