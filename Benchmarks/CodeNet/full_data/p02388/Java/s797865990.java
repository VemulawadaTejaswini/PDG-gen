import java.io.*;

public class Main{
  public static void main(String[] args) {
    int x;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
    try  {
    System.out.println("Imput x(1<=x<=100)");
    String line = reader.readLine();
    x = Integer.parseInt(line);
    System.out.println(x*x*x);
   } catch (IOException e){
  }
  }
}