import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    ArrayList<Long> array = new ArrayList<Long>();
    long sum = 0;
    long mod = 1000000007;
    for(int i = 0;i < num;i++){
      array.add(sc.nextLong());
      sum += array.get(i);
      sum %= mod;
    }
    long ans = 0;
    for(int i = 0;i < num;i++){
      sum -= array.get(i);
      if(sum < 0){
        sum += mod;
      }
      ans += array.get(i) * sum;
    }
    System.out.println(ans % mod);
  }
}
      