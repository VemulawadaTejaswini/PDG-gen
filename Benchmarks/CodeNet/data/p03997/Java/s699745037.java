import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Node2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  

       
        String str = in.readLine();
        
        int a = Integer.parseInt(str);
        
        str = in.readLine();
        
        int b = Integer.parseInt(str);       
        str = in.readLine();
        
        int h = Integer.parseInt(str);

  
        int anser = (a+b)*h/2;
        
        System.out.println(anser);
    }
    

}

