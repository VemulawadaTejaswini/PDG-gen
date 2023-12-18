import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int[] b=new int[k];
    for(int i=0;i<k;i++){
      b[i]=0;
    }
    for(int i=k-1;i<=n-k;i++){
      int[] c=new int[k];
      for(int j=0;j<k;j++){
        c[j]=0;
      }
      for(int j=0;j<k;j++){
        c[j]+=a[i+j];
      }
      int d=0;
      int e=0;
      for(int j=0;j<k;j++){
        d+=b[j];
        e+=c[j];
      }
      if(d<e){
        b=c;
      }
    }
    double f=0;
    double h=0;
    for(int i=0;i<k;i++){
      for(int j=0;j<=b[i];j++){
        f+=(double)j;
      }
      h+=b[i];
    }
    double g=f/h;
    System.out.println(g);
  }
}