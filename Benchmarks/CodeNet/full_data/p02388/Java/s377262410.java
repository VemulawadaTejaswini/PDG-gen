import java.io.*;

public class Main {
 public static void main(String args[]) throws IOException {
  BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
  String bs=b.readLine();
  int x=Integer.parseInt(bs);
  for(int i=1;i<3;i++){
   x=x*x;
  }
  System.out.println(x);
 }
}