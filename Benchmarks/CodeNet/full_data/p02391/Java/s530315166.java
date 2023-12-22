import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author k15115kk
 */
public class Main {

    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader is = new InputStreamReader(System.in);       
        BufferedReader br = new BufferedReader(is);
        String s=br.readLine();
       StringTokenizer st=new StringTokenizer(s," ");
         
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        
       if(-1000 <= a && 1000 >= b){
           if(a < b){
               System.out.println("a < b");
           }else if(a > b){
               System.out.println("a > b");
           }else if(a == b){
               System.out.println("a == b");
           }
       }
     
    
}
}