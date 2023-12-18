import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();
    String ans;
    
    if(S.equals("keyence")){
      System.out.println("YES");
      return;
    }else{
      if(S.contains("k") && S.contains("eyence")){
          System.out.println("YES");
          return;
      }else{
          ans = "NO";
      }
         
      if(S.contains("ke") && S.contains("yence")){
          System.out.println("YES");
          return;
      }else{
          ans = "NO";
      }
         
      if(S.contains("key") && S.contains("ence")){
          System.out.println("YES");
          return;
      }else{
          ans = "NO";
      }
         
      if(S.contains("keye") && S.contains("nce")){
          System.out.println("YES");
          return;
      }else{
         ans = "NO";
      }
         
      if(S.contains("keyen") && S.contains("ce")){
          System.out.println("YES");
          return;
      }else{
          ans = "NO";
      }
         
      if(S.contains("keyenc") && S.contains("e")){
          System.out.println("YES");
          return;
      }else{
         ans = "NO";
      }
      
      System.out.println(ans);
    }
  }  
}