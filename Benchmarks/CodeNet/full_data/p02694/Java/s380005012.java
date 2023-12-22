import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int balance = 100;
    int ans = 0;
    while(balance < x){
      balance = balance + (int)(balance * 0.01);
      ans++;
    }
    System.out.println(ans);
  }
}