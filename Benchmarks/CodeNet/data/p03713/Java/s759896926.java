import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    long h=sc.nextInt();
    long w=sc.nextInt();
    if(h%3==0||w%3==0){
      System.out.println(0);
      return;
    }
    long min=Long.MAX_VALUE;
    long dh=h/3;
    min=Long.min(sa(dh,h,w),min);
    dh++;
    min=Long.min(sa(dh,h,w),min);
    long dw=w/3;
    min=Long.min(sa(dw,w,h),min);
    dw++;
    min=Long.min(sa(dw,w,h),min);
    System.out.println(min);
  }
  static long sa(long d,long da, long b){
    return Long.max(sag(d,da,b),sal(d,da,b));
  }
  static long sag(long d,long da,long b){
    return Math.abs(d*b-div2g(da-d,b));
  }
  static long sal(long d,long da,long b){
    return Math.abs(d*b-div2l(da-d,b));
  }
  static long div2g(long h,long w){
    if(h%2==0||w%2==0){
      return h*w/2;
    }
    return (Long.max(w,h)/2+1)*Long.min(w,h);
  }
  static long div2l(long h,long w){
    if(h%2==0||w%2==0){
      return h*w/2;
    }
    return (Long.max(w,h)/2)*Long.min(w,h);
  }
}