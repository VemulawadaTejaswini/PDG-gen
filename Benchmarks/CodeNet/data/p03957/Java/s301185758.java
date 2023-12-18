import java.io.*;
public class Main {

   public static void main(String args[]) {
   	
   	try {
     BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
     String line = Reader.readLine();
     	if(line.indexOf( "C")>-1 && line.lastIndexOf( "F")>0){
     		System.out.println("Yes");
								}else{
			System.out.println("No");
      }
      } catch(IOException e) {
            System.err.println(e.getMessage());
   		}
   }
   }