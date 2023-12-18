import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    long b = sc.nextLong();
    long n = sc.nextLong();
    long max = 0;
    long num = 0;

    for(long i=0; i<=n; i++){

      num = (a*i)/b - a * (i/b);

      if(num>max){
      max = num;
      }

    }
    System.out.println(max);


  }
}