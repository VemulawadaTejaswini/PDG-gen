import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong(),b = sc.nextLong(),n = sc.nextLong();
    long x = 0;
    if(b-1>n){
      x=n;
    }else{
      x=b-1;
    }
    long ans = (long)(a*x)/b - a*(long)(x/b);
    pl(ans+"");
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
