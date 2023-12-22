import java.io.*;

public class Main{
  public static void main(String[] args){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String line=reader.readLine();
    int a=Integer.parseInt(s);

    line=reader.readLine();
    int b=Integer.parseInt(s);

    if(a<b){
      System.out.println("a<b");
    }else if(a>b){
      System.out.println("a>b");
    }else{
      System.out.println("a==b");
    }
  }
}