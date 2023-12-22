import java.util.*;

public class Main{
  public static void main(String[] args){
  String s;
  Scanner scanner = new Scanner(System.in);
  s = scanner.nextLine();
  final int MOD = 2019;
  int power_of_ten  =1;
  int n = s.length(), suf  = 0;
  long answer = 0;
  int[] cnt_suf = new int[MOD];
  cnt_suf[suf]++;
  
  for (int i= n -1; i >=0; i--){
    int digit = s.charAt(i) - '0';
    suf = (suf + digit * power_of_ten) % MOD;
    power_of_ten = 10 * power_of_ten % MOD;
    answer += cnt_suf[suf];
    cnt_suf[suf]++;
  }
  System.out.println(answer);
}
  
}