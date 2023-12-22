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
             int a = Integer.parseInt(array[0]);
             int b = Integer.parseInt(array[1]);
             if(a < b){          
             System.out.println(a + " " + b);}
             else if(a > b){          
             System.out.println(b + " " + a);}
            }         
  }
}