import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n+2];
    int sum=0;
    for(int i=1;i<=n;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<=n;i++){
      sum+=Math.abs(a[i+1]-a[i]);
    }
    int[] b=new int[n];
    for(int i=0;i<n;i++){
      b[i]=Math.abs(a[i+2]-a[i+1])+
           Math.abs(a[i+1]-a[i  ])-
           Math.abs(a[i+2]-a[i  ]);
    }
    for(int i=0;i<n;i++){
      System.out.println(sum-b[i]);
    }
  }
}