import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    long sum=0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt()-i;
      sum=sum+a[i];
    }
    long ans1=0;
    long ans2=0;
    for(int i=0;i<n;i++){
      ans1=ans1+Math.abs(a[i]-(sum/n));
      ans2=ans2+Math.abs(a[i]-(sum/n+1));
    }
    System.out.println(Math.min(ans1,ans2));
  }
}