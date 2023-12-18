import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    String tmp ="";
    for(int i = 0;i<200;i++){
      tmp = S.substring(0,1);//先頭を後ろにやっても変わんない
      S = S.substring(1,S.length())+tmp;

      if(S.equals(T)){
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
    
  }
  

  
}