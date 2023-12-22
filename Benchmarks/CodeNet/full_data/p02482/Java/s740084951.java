import java.io.*;

public class Main{
  public  static void main(String args[]){
    System.out.println("input two numbers");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try{
      String a =reader.readLine();
      String b =reader.readLine();
      int c=Integer.parseInt(a);
      int d=Integer.parseInt(b);
      if (c<d) {
        System.out.println(a+" < "+b);
      }
      else if(c>d){
        System.out.println(a+" > "+b);
      }
      else{
        System.out.println(a+" = "+b);
      }
    }catch(IOException e){
      System.out.println(e);
    }catch (NumberFormatException e){
      System.out.println("Fuck you!");
        }
  }
}