import java.util.*;

class Main{
  static class U{
    int f;
    int[] a;
    U(int n){
      f=n;
      a=new int[n];
      for(int i=0;i<n;i++){
        a[i]=i;
      }
    }
    int r(int i){
      if(i==a[i]){
        return i;
      }
      a[i]=r(a[i]);
      return a[i];
    }
    void m(int i,int j){
      if(r(i)!=r(j)){
        f--;
        a[a[i]]=a[j];
      }
    }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    U u=new U(n);
    for(int i=0;i<m;i++){
      u.m(sc.nextInt()-1,sc.nextInt()-1);
      sc.nextInt();
    }
    System.out.println(u.f);
  }
}