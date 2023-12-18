import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Integer[] a=new Integer[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    int nc=a[n-1];
    int ck=a[0];
    for(int i=1;i<n-1;i++){
      if(calc(nc,ck)<calc(nc,a[i])){
        ck=a[i];
      }
    }
    System.out.println(nc+" "+ck);
  }
  static int calc(int n,int x){
    x=Math.min(x,n-x);
    return -(n/2-x);
  }
}