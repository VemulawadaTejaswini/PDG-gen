import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String S =sc.next();
    int T =S.length();
    String ans ="x";
    for(int i=0 ;i<T-1;i++){
      ans =ans+"x";}
    System.out.println(ans);
  }
}