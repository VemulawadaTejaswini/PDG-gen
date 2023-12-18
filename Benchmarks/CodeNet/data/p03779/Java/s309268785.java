import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long sum = 0;
    int cnt = 0;
    while(sum < x){
      cnt++;
      sum += cnt;
    }
    System.out.println(cnt);
  }
}