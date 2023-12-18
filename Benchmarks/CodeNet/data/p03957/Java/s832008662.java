import java.io.*;
import java.util.regex.Pattern;
 
public class Main {

   public static void main(String args[]) {
   	

     BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
try{
     String line = Reader.readLine();

          	if (line.indexOf("C")<line.indexOf("F") && line.indexOf("C")>-1)  {
          		System.out.println("Yes");
          	   } else  {
          	   	 System.out.println("No");
          	   	    } 
          	   	    
          	   	   } catch (IOException e) {
           								 System.out.println(e);
        												}
                }

          	   } 
      		