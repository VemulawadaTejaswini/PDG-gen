import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    try {
      Scanner sc = new Scanner(System.in);
      int n, ans=0;
      n=Integer.parseInt(sc.next());
      int[] h = new int[n];
      for(int i=0; i<n; i++){
        h[i]=Integer.parseInt(sc.next());
      }

      for(int i=0; i<n-1; i++){
        if(h[i]>h[i+1]){
          ans=ans+h[i]-h[i+1];
        }
      }

      System.out.println(ans+h[n-1]);
      
                
      }catch (Exception e) {
      System.out.println("out");
    }
  }
}
