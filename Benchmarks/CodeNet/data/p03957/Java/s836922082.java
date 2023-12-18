import java.io.*;
import java.util.regex.Pattern;
 
public class Main {

   public static void main(String args[]) {
   	
   	try {
     BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
     String line = Reader.readLine();
     String regexp = "C.*F";
     boolean match = Pattern.matches(line, regexp);
     	if(match = true ){
     		System.out.println("Yes");
								}else{
			System.out.println("No");
			   }
			   } catch(IOException e) {
            System.err.println(e.getMessage());
   		}
      }
      }
     