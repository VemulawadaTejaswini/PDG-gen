import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    String t = sc.next();
    String st = "";
    for(int i = 0 ; i < n ; ++i){
      st += s.charAt(i);
      st += t.charAt(i);
    }
   
    System.out.println(st);
    
  }
}