import java.io.*;
public class Main{
  public static void main(String args[]){
    BufferedReader br = new BufferedReader(new InputStreamReader);
    String s = br.readLine();
    if(s.charAt(s.indexOf(" ") - 1) & 1 == 0){
      System.out.println("Even");
    } else if (s.charAt(s.length() - 1) & 1 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
}