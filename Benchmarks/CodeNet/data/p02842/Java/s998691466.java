import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
      double n=s.nextDouble();
      double d=(double)Math.round((double)n/1.08);
      if(n>(double)d*1.08){
      	System.out.println(":(");
      }
      else{
      	System.out.println((int)d);
      }
        }
    }
