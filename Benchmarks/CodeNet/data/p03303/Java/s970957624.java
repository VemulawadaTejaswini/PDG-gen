import java.util.Scanner;
import java.io.*;

public class Main{

     public static void main(String []args){
        
        try{
        Scanner stdIn = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        
        char[] charArray = str.toCharArray();
        
        int b = stdIn.nextInt();

        String newStr = "";
        for (int i = 0;i < charArray.length;i += b) {
	        
	        newStr += charArray[i];
	       
        }
        

        System.out.println(newStr);
        
        }catch(IOException e){
             System.out.println("Exception :" + e);
        }
        
     }
}
