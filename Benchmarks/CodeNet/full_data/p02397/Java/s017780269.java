import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        for (int i = 0; (str = br.readLine()) != null; i++){
             if (str.equals("0 0")){
             break;
               }
             String[] array = str.split(" ");
             Arrays.sort(array);
             System.out.println(array[0] + " " + array[1]);
            }  
            
            
  }
}