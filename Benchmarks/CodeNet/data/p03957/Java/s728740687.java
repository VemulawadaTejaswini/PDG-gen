import java.io.*;
public class Main {

   public static void main(String args[]) {
   	
   	try {
     BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
     String line = Reader.readLine();
     	if(line.indexOf( "CF")>-1 ){
     		System.out.println("Yes");
								}else{
			System.out.println("No");
      }
      } catch(IOException e) {
            System.err.println(e.getMessage());
   		}
   }
   }