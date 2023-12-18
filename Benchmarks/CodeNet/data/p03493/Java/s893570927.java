import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = a;
    String n;
    int len;
    int lenans = 4;
    int i = 0;
    n = String.valueOf(i);
    b = a.replace(n,"");
    len = b.length();
    if(len < lenans){
        lenans = len;
      }
    b = a;
    System.out.println(lenans);
  }
}
