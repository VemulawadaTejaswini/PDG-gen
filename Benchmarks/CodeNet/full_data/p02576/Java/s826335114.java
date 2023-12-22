import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();
    int count = 0;
    int now = 0;
    while(n>now){
      count++;
      now += x;
    }
    System.out.println(count * t);
  }
}
