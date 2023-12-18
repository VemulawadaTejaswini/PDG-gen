import java.util.*;
  class Main{
  public static void main(String[] args){
  	int m,n;
    Scanner s=new Scanner(System.in);
    m=s.nextInt();
    n=s.nextInt();
    int[] a=new int[n];
    int sum=0;
    for(int i=0;i<=n;i++){
      a[i]=s.nextInt();
      sum+=a[i];
  }
    Arrays.sort(a);
    int cnt=0;
    for(int i=0;i<=m;i++){
      if(a[i]>=1/4*m) cnt++;
    }
    if(cnt>=n){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
 }