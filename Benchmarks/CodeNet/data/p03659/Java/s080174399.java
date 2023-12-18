import java.util.*;
import java.lang.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];

    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }

    int x = 0;
    int y = 0;
    int p = 0;
    int min = Integer.MAX_VALUE;
    for(int i=1;i<n;i++){
      x=0;
      y=0;
      p=0;
      for(p=0;p<i;p++){
        x += a[p];
      }
      for(int q=0;q<n-p;q++){
        y += a[p+q];
      }
      
      if(min>Math.abs(x-y)){
      min = Math.abs(x-y);
     }
    }

    System.out.println(min);
  }
}