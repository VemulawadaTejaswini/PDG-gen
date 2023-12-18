import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();
    for(int i = 0; i < str1.length(); i++){
      System.out.print(str1.charAt(i));
      System.out.print(str2.charAt(i));
    }
    System.out.println();
  }
}