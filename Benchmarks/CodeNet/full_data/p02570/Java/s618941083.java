import java.io.*;
import java.util.*;
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String in = br.readLine();
    in = in.trim();
    String f[] = in.split(" ");
    int d = Integer.parseInt(f[0]);
    int t = Integer.parseInt(f[1]);
    int s = Integer.parseInt(f[2]);
    int calcT = d/s;
    if(calcT <= t)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
