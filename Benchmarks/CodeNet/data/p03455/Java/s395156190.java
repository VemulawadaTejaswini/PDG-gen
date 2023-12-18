import java.io.*;
public class Main{
  public static void main(String args[]) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    int pos = -1;
    int next = -1;
    
    for(; (next = isr.read()) != ' '; pos = next);
    if((1 & pos) == 0){
      System.out.println("Even");
      return;
    }
    
    for(; (next = isr.read()) != -1; pos = next);
    if((1 & pos) == 0){
      System.out.println("Even");
      return;
    }
    
    System.out.println("Odd");
  }
}