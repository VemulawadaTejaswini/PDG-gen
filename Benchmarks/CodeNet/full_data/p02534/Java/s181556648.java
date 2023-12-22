import java.io.*;
import java.math.*;

class Main{


    public static void main(String args[])throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());
    String s = "";
    for(int i=0;i<t;i++) s += "ACL";

    System.out.println(s);
  }
}