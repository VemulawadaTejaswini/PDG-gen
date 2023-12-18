import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String S =sc.next();
    String t =S.substring(0,4);
    String u =S.substring(4,12);
    System.out.println(t+" "+u);
  }
}