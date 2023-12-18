import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    
        String s = br.readLine();
        
        if(s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)){
            out.println("Yes");
        }else{
            out.println("No");
        }
        out.close();
        
    }
}