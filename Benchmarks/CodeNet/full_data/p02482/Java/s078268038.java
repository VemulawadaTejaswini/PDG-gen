import java.io.*;

public class Main{
  public static void main(String[] args){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s;
    int a,b;

    s=reader.readLine();
    a=Integer.parseInt(s);

    s=reader.readLine();
    b=Integer.parseInt(s);

    if(a<b){
      System.out.println("a<b");
    }else if(a>b){
      System.out.println("a>b");
    }else{
      System.out.println("a==b");
    }
  }
}