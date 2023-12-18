import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
  
class Main 
{ 
    public static void main(String[] args) throws IOException 
    { 
  
        BufferedReader br = new BufferedReader( 
                              new InputStreamReader(System.in)); 
  
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        int a = Integer.parseInt(st.nextToken()); 
        int b = Integer.parseInt(st.nextToken()); 
        int c = Integer.parseInt(st.nextToken()); 
        if (a+b+c>=22) System.out.println("bust");
        else System.out.println("win"); 
    } 
} 