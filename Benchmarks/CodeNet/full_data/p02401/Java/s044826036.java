import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(str, " ");
        
        int a = Integer.parseInt(st.nextToken());
        String b = st.nextToken();
        int c = Integer.parseInt(st.nextToken());
       
            while (true) {
            if (b=="+"){
                System.out.println(a + b);
            }
            else if (b=="-") {
                System.out.println(a - b);
            }
            else if (b=="*"){
                System.out.println(a * b);
            }
            else if (b=="/"){
                System.out.println(a / b);
            }
            else{
                break;
            }
            }
        
        
        
    }
    
}