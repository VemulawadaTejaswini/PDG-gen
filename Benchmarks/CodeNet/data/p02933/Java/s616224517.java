import java.io.*;
import java.util.*;

public class Main{
  	public static void main(String[] args){
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(br.readLine());
      String s=br.readLine();
      if(!n<3200){
       System.out.println(s); 
      }else{
        System.out.println("red");
      }
    }
}