import java.util.*;
 
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    //カーテンの長さを求める
    int BB = B*2;
    
    if(A <= BB){
      //カーテンの方が長い場合は全て隠れるので0
      System.out.println(0);
    }else{
      //カーテンの方が短い場合は隠れていない長さを求める
       System.out.println(A-BB);
    }
  }
      
 }