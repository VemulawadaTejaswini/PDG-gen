import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String startc = sc.next();
    StringBuilder ans = new StringBuilder(startc);
    int Q = sc.nextInt();
    
    //操作
    while(sc.hasNext()){
      int T = sc.nextInt();
      if(T == 1){
        ans = ans.reverse();
      }else if(T == 2){
        int F = Integer.parseInt(sc.next());
        if(F == 1){
          ans = ans.insert(0, sc.next());
        }else if(F == 2){
          ans = ans.append(sc.next());
        }
      }
    }
    
    System.out.println(ans.toString());
    
  }
}