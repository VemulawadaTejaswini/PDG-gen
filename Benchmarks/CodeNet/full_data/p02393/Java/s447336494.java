import java.io.*;
import java.util.*;
 
public class Main{
  public static void main(String[] args)throws IOException{
     
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
 
    String[] strAry = str.split(" ");

    Arrays.sort(strAry); 


    System.out.print(strAry[0] + " " + strAry[1]  + " " + strAry[2]);
    
  }
}