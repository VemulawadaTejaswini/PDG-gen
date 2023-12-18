import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {
 
    public static void main(String[] args)throws IOException {
        
     BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       int x=Integer.parseInt(in.readLine());
       double f=Math.sqrt(x);
       int d= (int)Math.floor(f);
       System.out.println(d*d);


    }
}
