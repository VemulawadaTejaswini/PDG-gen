import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n+1];
    int[] c = new int[n+1];
    int[] sum = new int[n+1];
    int ans=1;
    int w,nres=1;
    
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
      c[a[i]]+=1;
    }
    for(int i=0;i<n;i++){
      w = c[i];
      nres=1;
      for(int j=w;j>(w-2);j--) nres*=j;
      nres/=2;
      sum[i]=nres;
      ans+=nres;
    }
    for(int i=0;i<n;i++){
      System.out.println(ans-c[a[i]]);
    }
  }
}