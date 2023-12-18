import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
 
    String S = sc.next();
    char[] s = S.toCharArray();
    int[] list = new int[s.length];
    
    for(int i = 0; i < s.length ; i++){
       char M = s[i];
       int m = Character.getNumericValue(M);
       list[i] = m;
    }
    
    int Min = 753;
    int G = 0;
    for(int i = 2; i <= list.length-1 ; i++){
      int g = list[i-2]*100 + list[i-1]*10 + list[i];
      if(g >= 753){
        G = g - 753;
      }else{
        G = 753 - g;
      }
     
      if(Min > G){
        Min = G;
      }
    }
  
    System.out.println(Min);
    
  }
}