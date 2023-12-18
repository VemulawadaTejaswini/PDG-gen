import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] x=new int[n];
    for(int i=0;i<n;i++){
      x[i]=sc.nextInt();
    }
    long min=Long.MAX_VALUE;
    for(int i=0;i+k-1<n;i++){
      min=Long.min(calc(x[i],x[i+k-1]),min);
    }
    System.out.println(min);
  }
  static long calc(long l,long r){
    if(l*r<0){
      return Long.min(
        Math.abs(l+l)+Math.abs(r),
        Math.abs(r+r)+Math.abs(l)
      );
    }else{
      return Long.max(Math.abs(l),Math.abs(r));
    }
  }
}