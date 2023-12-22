import java.util.*;

class Main{
  static int n,m,q;
  static int[] a,b,c,d;
  static int[] ary;
  static long ans=0;
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    m=sc.nextInt();
    q=sc.nextInt();
    a=new int[q];
    b=new int[q];
    c=new int[q];
    d=new int[q];
    for(int i=0;i<q;i++){
      a[i]=sc.nextInt();
      b[i]=sc.nextInt();
      c[i]=sc.nextInt();
      d[i]=sc.nextInt();
    }
    ary=new int[n];
    calc(0,m);
    System.out.println(ans);
  }
  static void calc(int pos,int remi){
    if(pos==n){
      long ten=0;
      for(int i=0;i<q;i++){
        if(ary[b[i]-1]-ary[a[i]-1]==c[i]){
          ten=ten+d[i];
        }
      }
      ans=Long.max(ten,ans);
      return;
    }
    if(pos==0){
      for(int i=1;i<=remi;i++){
        ary[0]=i;
        calc(1,remi-i);
      }
    }else{
      for(int i=0;i<=remi;i++){
        ary[pos]=ary[pos-1]+i;
        calc(pos+1,remi-i);
      }
    }
  }
}