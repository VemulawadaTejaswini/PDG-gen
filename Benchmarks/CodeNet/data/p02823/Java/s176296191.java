import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long a=sc.nextLong();
    long b=sc.nextLong();
    if((a&1)==(b&1)){
      System.out.println((b-a)/2);
    }else{
      System.out.println(Math.min((a),(n-b+1))+(b-a)/2);
    }
  }
}