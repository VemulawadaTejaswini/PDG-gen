import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long all = 1l;
    long zero_or_nine_is_no = 2l;
    long both_is_no = 1l;
    for(int i = 0;i<n;i++){
      all *= 10l;
      all %= 2000000014l;
      zero_or_nine_is_no *= 9l;
      zero_or_nine_is_no %= 2000000014l;
      both_is_no *= 8l;
      both_is_no %= 2000000014l;
    }
    long ans = all - zero_or_nine_is_no + both_is_no;
    ans %= 1000000007l;
    System.out.println(ans);
  }
}
