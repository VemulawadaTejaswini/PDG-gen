import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
   
    double r = 0.0;
    String[] s =  reader.readLine().split(" ");
    for(int i =0;i<a;i++){
      r = r+ 1.0/(double)Integer.parseInt(s[i]);}
 
      System.out.println(1.0/r);}
}