import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args){
    BufferedReader bf = new BufferedReader(new ImputStreamReader(System.in));
    try{
      int a = Integer.parseInt(bf.nextLine());
      int b = Integer.parseInt(bf.nextLine());
      int c = Integer.parseInt(bf.nextLine());
      int d = Integer.parseInt(bf.nextLine());
    }catch(Exception e){
      
    }
    
    System.out.println(Math.min(a, b) + Math.min(c, d));
  }
}