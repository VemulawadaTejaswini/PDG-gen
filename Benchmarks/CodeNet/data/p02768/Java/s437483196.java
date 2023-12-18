import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    int mae = 1;
    for(int i = 1;i <= n;i++){
      if(i != a && i != b){
        count += mae * (n - i + 1) / i;
      }
      mae = mae * (n - i + 1) / i;
      count %= 1000000007;
      mae %= 1000000007;
    }
    System.out.println(count);
  }
}
