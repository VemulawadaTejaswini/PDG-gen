import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong(),k = sc.nextLong();
    if(n%k==0){
      pl("0");
    }else{
      if(n<k){
        long aa=n;n=k;k=aa;
      }
      pl(zz(n,k)+"");
    }
  }

  public static long zz(long a,long b){
    long c=0;
    while(a%b!=0){
      c = a%b;
      a=b;b=c;
    }
    return b;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
