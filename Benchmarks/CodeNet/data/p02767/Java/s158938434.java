import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] x=new int[n];
    for(int i=0;i<n;i++) x[i]=sc.nextInt();
    Arrays.sort(x);
    long[] p=new long[x[n-1]];
    long min=999999999999999999L;
    for(int i=x[0];i<x[n-1];i++){
      for(int j=0;j<n;j++){
        p[i]+=(long)Math.pow((double)x[j]-(double)i,2.0);
      }
      min=Math.min(min,p[i]);
    }
    System.out.println(min);
  }
}