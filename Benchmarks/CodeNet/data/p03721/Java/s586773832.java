import java.util.*;
public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int max = 100000;
    int n = sc.nextInt();
    long k = sc.nextLong();

    long[] nums = new long[max+1];

    for(int i = 1; i <= n; i++){
      nums[sc.nextInt()] += sc.nextInt();
    }
    for(int i = 1; i < nums.length; i++) {
          k -= nums[i];
          if(k <= 0) {
            System.out.println(i);
            return;
          }
    }
  }
}
