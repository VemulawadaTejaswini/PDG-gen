import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    long a=scan.nextLong();
    long b=scan.nextLong();
    System.out.println(func(b)^func(a-1));
  }
  public static long func(long n){
    if(n<0){
      return 0L;
    }else{
      if(n%4==0){
        return n;
      }else if(n%4==1){
        return 1L;
      }else if(n%4==2){
        return n^1;
      }else{
        return 0L;
      }
    }
  }
}
