import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long x = sc.nextLong();
    long idx = 0;
    long loop = 1;

    for(long i = a; i <= b; i++){
      if(i % x == 0){
        idx = loop; break;
      }
      loop++;
    }

    long ans = (b-a+1)/x;//x個の繰り返しが何回あるか
    if((b-a+1) % x >= idx && idx > 0){ans++;}

    System.out.println(ans);

  }
}