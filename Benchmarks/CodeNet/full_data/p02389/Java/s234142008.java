import java.io.*;
public class Main{
  public static void main (String[]args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    int a = Integer.parseInt( br.readLine() );
    int b = Integer.parseInt( br.readLine() );
    int c = a * b;
    int d = 2 * a + 2 * b ; 
    System.out.println(c + " " + d);
  }
}