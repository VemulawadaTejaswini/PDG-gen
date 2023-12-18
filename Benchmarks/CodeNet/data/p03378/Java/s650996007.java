import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int x=sc.nextInt();
    int[] a=new int[n+1];
    for(int i=0;i<m;i++){
      a[sc.nextInt()]=1;
    }
    for(int i=0;i<n;i++){
      a[i+1]+=a[i];
    }
    System.out.println(Math.min(a[x],a[n]-a[x]));
  }
}