import java.util.*;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long amt = 0;
    for(long i=1;i<=x;i++){
      if(i%3!=0&&i%5!=0)
        amt+=i;
    }
    System.out.println(amt);
  }
}