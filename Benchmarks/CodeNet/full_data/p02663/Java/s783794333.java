import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int H1 = Integer.parseInt(sc.next());
    int M1 = Integer.parseInt(sc.next());
    int H2 = Integer.parseInt(sc.next());
    int M2 = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    
    if(H1 >= 0 && H1 <= 23 && H2 >= 0 && H2 <= 23 &&
       M1 >= 0 && M1 <= 59 && M2 >= 0 && M2 <= 59 && K >= 1){
      if(H2 > H1){
       if(M1 != 0){
         int m1 = 60 - M1;
         H1 += 1;
         int H = (H2 - H1) * 60;
         int M =  H + m1 + M2;
         int ans = M - K;
         
         if(ans >= 0){
           System.out.println(ans);
         }else{
           System.out.println("勉強はできません");
         }
       }else{
         int H = (H2 - H1)*60;
         int M = H + M2;
         int ans = M - K;
        if(ans >= 0){
          System.out.println(ans);
        }else{
          System.out.println("勉強はできません");
        }
      }        
     }else{
        H1 = 24 - H1;
        if(M1 != 0){
         int m1 = 60 - M1;
         H1 -= 1;
         int H = (H2 + H1)*60;
         int M =  H + m1 + M2;
         int ans = M - K;
         if(ans >= 0){
           System.out.println(ans);
         }else{
           System.out.println("勉強はできません");
         }
       }else{
         int H = (H2 + H1)*60;
         int M = H + M2;
         int ans = M - K;
        if(ans >= 0){
          System.out.println(ans);
        }else{
          System.out.println("勉強はできません");
        } 
      }
      }
    }else{
      System.out.println("入力条件に違反しています");
    }
    
    
  }
  
}