import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int max = -10000000;
    int min = 10000000;
    int idx1 = 0;
    int idx2 = 0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      if(a[i]>=max){
        max=Math.max(max,a[i]);
        idx1=i+1;
      }
      if(a[i]<=min){
        min=Math.min(min,a[i]);
        idx2=i+1;
      }
    }
    if(Math.abs(max)>=Math.abs(min)){
      System.out.println(2*n-1);
      for(int i=0;i<n;i++){
        System.out.println(idx1+" "+(i+1));
      }
      for(int i=1;i<n;i++){
        System.out.println(i+" "+(i+1));
      }
    }else{
      System.out.println(2*n-1);
      for(int i=0;i<n;i++){
        System.out.println(idx2+" "+(i+1));
      }
      for(int i=n-1;i>=1;i--){
        System.out.println((i+1)+" "+i);
      }
    }
  }
}