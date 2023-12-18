import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s1 = sc.next();
    String s2 = sc.next();
    String s3 = sc.next();
    
    String s1first = s1.substring(0, 1);
    String s2first = s2.substring(0, 1);
    String s3first = s3.substring(0, 1);
    
    String s1firstUpper = s1first.toUpperCase();
    String s2firstUpper = s2first.toUpperCase();
    String s3firstUpper = s3first.toUpperCase();
    
    System.out.println(s1firstUpper + s2firstUpper + s3firstUpper);
  }
}