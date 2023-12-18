import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class Main
{
  static HashMap<String, Long> DP[];
  static String Chars = "ACGT";
  
  static boolean isValid(String S)
  {
    if (S.contains("AGC"))
    {
      return false;
    }
    for (int i = 1; i < S.length(); i++)
    {
      //ACG
      //i = 2
      //AGC
      String temp = "";
      for (int j = 0; j < i - 1; j++)
      {
        temp += S.charAt(j);
      }
      temp += S.charAt(i) + "" + S.charAt(i - 1);
      for (int j = i + 1; j < S.length(); j++)
      {
        temp += S.charAt(j);
      }
      if (temp.contains("AGC"))
      {
        return false;
      }
    }
    return true;
  }
  
  static long DFS(int N, String cur) //N is the remaining length of string; cur is the last 3 characters of the current string
  {
    if (DP[N].containsKey(cur))
    {
      return DP[N].get(cur);
    }
    if (N == 0) return 1;
    DP[N].put(cur, 0l);
    for (int i = 0; i < Chars.length(); i++)
    {
      if (isValid(cur + Chars.charAt(i)))
      {
        long prev = DP[N].get(cur);
        long result = DFS(N - 1, cur.substring(1) + Chars.charAt(i));
        int MOD = (int)1e9 + 7;
        DP[N].put(cur, (prev + result) % MOD);
      }
    }
    return DP[N].get(cur);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); DP = new HashMap[N + 1];
    //long a = 1000000, b = 1000000;
    //System.out.println(a * b);
    //an integer can only store up to 9,000,000,000,000,000
    //it only has 63 bits to store information:
    //2^63 - 1; 1e19
    for (int i = 0; i <= N; i++)
    {
      DP[i] = new HashMap<>();
    }
    long result = DFS(N, "TTT");
    System.out.println(result);
  }
}
