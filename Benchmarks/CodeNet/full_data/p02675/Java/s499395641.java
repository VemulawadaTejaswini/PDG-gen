import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
//System.out.println();
public class Main{
   String op(int n){

      if(n%10==3){
         return "bon";
      }else if(n%10==0||n%10==1||n%10==6||n%10==8){
         return "pon";
      }else{
         return "hon";
      }
   }




   public static void main(String[] args)  throws IOException {
      // Use the Scanner class
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
          
        while(br.ready()){
int t = Integer.parseInt(br.readLine());  
          
        // String Buffer to store answer 
        StringBuffer sb = new StringBuffer(); 
       Main obj = new Main();
        // One by one run for all input test cases  
        
          
        System.out.println(obj.op(t)); 
       }
return;
}
}