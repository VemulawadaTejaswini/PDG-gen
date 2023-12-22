import java.io.*;

public class Sle{
  public static void main(String[] args){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s;
    int a,b;

    s=reader.readLine();
    a=Integer.parseInt(line);

    s=reader.readLine();
    b=Integer.parseInt(line);

    if(a<b){
      System.out.println("a<b");
    }else if(a>b){
      System.out.println("a>b");
    }else{
      System.out.println("a==b");
    }
  }
}