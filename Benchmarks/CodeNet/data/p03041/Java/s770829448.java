import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt(),k=in.nextInt();
    String s=in.next();
    String p="";
    for(int i=0;i<n;i++){
      if(i==k-1)
      p+=Character.toLowerCase(s.charAt(i));
      else
      p+=s.charAt(i);
    }
    System.out.println(p);
  }
}