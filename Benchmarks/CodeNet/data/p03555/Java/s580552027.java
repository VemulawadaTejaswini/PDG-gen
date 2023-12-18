import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    StringBuffer sb = new StringBuffer(a);
    String rev = sb.reverse().toString();
    if(rev.equals(b)){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}