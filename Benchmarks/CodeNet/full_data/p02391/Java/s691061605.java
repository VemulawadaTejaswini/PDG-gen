import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int a=Integer.parseInt(scan.next());
    int b=Integer.parseInt(scan.next());

    if(a>b){
      System.out.println(" a> b");
    }else if(a<b){
      System.out.println("a < b");
    }else if(a==b){
      System.out.println("a == b");
    }
  }
}
