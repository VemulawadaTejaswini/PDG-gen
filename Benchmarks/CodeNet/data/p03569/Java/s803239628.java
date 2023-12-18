import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int cnt = 0;
    while(s.length()>=2){
      char first = s.charAt(0);
      char last = s.charAt(s.length()-1);
      if(first==last){
        s=s.substring(1,s.length()-1);
      }else if(first=='x'){
        s=s.substring(0,s.length())+"x";
        cnt++;
      }else if(last=='x'){
        s="x"+s.substring(0,s.length());
        cnt++;
      }else{
        System.out.println(-1);
        return;
      }
    }
    System.out.println(cnt);
  }
}