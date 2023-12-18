import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    try {
      Scanner sc = new Scanner(System.in);
      int n;

      n=Integer.parseInt(sc.next());
      int[] l = new int[n];
      for(int i=0; i<n; i++){
        l[i]=Integer.parseInt(sc.next());
      }

      Arrays.sort(l);
      int lsum=0;
      for(int i=0; i<n-1; i++){
        lsum=lsum+l[i];
      }
      if(lsum>l[n-1]){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
                
      }catch (Exception e) {
      System.out.println("out");
    }
  }
}
