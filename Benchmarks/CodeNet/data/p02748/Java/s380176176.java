import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    int M = sc.nextInt();
       
    int[] aList = new int[A];
    int[] bList = new int[B];
    
    
    for(int i = 0; i < A; ++i){
      aList[i] = sc.nextInt();
    }
    int MinA = aList[0];
    for(int i = 1; i < A; ++i){
      if(MinA >= aList[i]){
        MinA = aList[i];
      }
    }
    
    for(int i = 0; i < B; ++i){
      bList[i] = sc.nextInt();
    }
    int MinB = bList[0];
    for(int i = 1; i < A; ++i){
      if(MinB >= bList[i]){
        MinB = bList[i];
      }
    }
    
    int AB = MinA + MinB;
    
    int a = 0;
    int b = 0;
    int c = 0;
    int ans = 0;
    for(int i = 1; i <= 3*M; ++i){
      if(i % 3 != 0){
        if(i % 2 != 0){
          a = sc.nextInt();
        }else{
          b = sc.nextInt();
        }
       }else{
        c = sc.nextInt();
       } 
      }
      ans = aList[a-1] + bList[b-1] - c;
      if(AB > ans){
        AB = ans;      
    }
    
    System.out.println(AB);
    
  }
  
}