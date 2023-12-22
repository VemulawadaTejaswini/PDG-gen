import java.io.*;

public class Main{
  public static void main(String args[])throws Exception{

  int i, o;

  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  i = Integer.parseInt(br.readLine());

  o = i*i*i;
  System.out.println(o);
  }
}