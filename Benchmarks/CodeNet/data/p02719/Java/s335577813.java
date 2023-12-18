import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong(),k = sc.nextLong();
    n = n%k;
    if(n<(double)k/2){
      pl(n+"");
    }else{
      pl((k-n)+"");
    }
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
