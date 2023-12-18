import java.util.*;
import java.math.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] val = new int[n+1];
    for(int i=0;i<n+1;i++){
      val[i] = 0;
    }
    int[] a = new int[n];
    
    int tmp;
      
    for(int i=0;i<n;i++){
      tmp = sc.nextInt();
      a[i] = tmp;
      val[tmp] += 1;
    }
    
    int ans;
    
    for(int j=0;j<n;j++){
      ans=0;
      val[a[j]] -= 1;
      
      for(int k=1;k<n+1;k++){
        ans += val[k]*(val[k]-1)/2;
      }
      System.out.println(ans);
      val[a[j]] += 1;
    }
      
   
  }
}