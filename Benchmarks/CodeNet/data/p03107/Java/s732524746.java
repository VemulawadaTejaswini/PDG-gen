import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int length = str.length();
    str = str.replace("0", "");
    int length0 = length - str.length();
    int length1 = str.length();
    System.out.println(Math.min(length0, length1) * 2);
  }
}