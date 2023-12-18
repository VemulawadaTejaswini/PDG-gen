import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    String S = stdIn.next();
    System.out.println(S.replaceAll(","," "));
  }
}