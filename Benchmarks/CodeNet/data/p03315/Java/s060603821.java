import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int takahashi = 0;
    String S;
    
    for(int i = 1; i <= 4; i++){
      S = sc.next();
      
      if(S.equals("+"))
        takahashi++;
      else
        takahashi--;
    }
    
    System.out.println(takahashi);
  }
}