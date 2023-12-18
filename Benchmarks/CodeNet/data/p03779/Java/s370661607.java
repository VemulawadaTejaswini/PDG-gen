import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    sc.close();
    long now = 0;
    for (long i=1;i<=x;i++){
      now += i;
      if (now >= x){
        System.out.println(i);
        break;
      }
    }
  }
}