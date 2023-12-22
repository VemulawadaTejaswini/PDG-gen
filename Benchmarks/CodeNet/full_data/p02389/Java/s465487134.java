import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException  {
        
        int a,b,x,y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        a = Integer.parseInt(st.substring(0,1));
        b = Integer.parseInt(st.substring(2,3));
        x = a*b;
        y = 2*a + 2*b;
        System.out.println(x+" "+y);        
    
    }
    
}