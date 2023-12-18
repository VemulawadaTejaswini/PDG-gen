import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next(),b = sc.next();
    for(int i = 0;i < b.length();i++){
      System.out.print(a.substring(i,i+1)+b.substring(i,i+1));
    }
    if(a.length() % 2 == 1){
      System.out.print(a.substring(a.length()-1,a.length()));
    }
  }
}
