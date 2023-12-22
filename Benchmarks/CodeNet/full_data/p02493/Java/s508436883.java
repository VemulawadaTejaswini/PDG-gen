import java.io.*;
class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    scan.readLine();
    StringBuffer str = new StringBuffer(scan.readLine());
    System.out.println(str.reverse().toString());
  }
}