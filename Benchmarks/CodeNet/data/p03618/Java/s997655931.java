import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int[] charCnt = new int[26];
      for(char c : s.toCharArray())
        charCnt[c - 'a']++;
      long sum = comb(s.length());
      for(int freq : charCnt) {
        sum -= comb(freq);
      }
      System.out.println(sum + 1);
  }

  private static long comb(long n) {
    return n * (n - 1) / 2;
  }
}