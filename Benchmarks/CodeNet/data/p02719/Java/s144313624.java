import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    long x = n%k;
    while(true){
    long temp =Math.abs(x - k);
    if(temp >= x){
      System.out.println(x);
      return;
    }
    x = temp;
  }
  }
}