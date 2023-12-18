import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long sum = 0;
    long cnt = 0;
    while(sum < x){
      cnt++;
      sum += cnt;
    }
    if(sum == x){
      System.out.println(cnt);
    }else{
      cnt -= 2;
      sum = cnt * (cnt + 1) / 2;
      cnt += x - sum - cnt;
      System.out.println(cnt);
    }
  }
}