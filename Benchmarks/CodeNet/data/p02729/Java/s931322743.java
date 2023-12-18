import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    int n = s.length();
    //回文かどうか
    StringBuffer s_sb = new StringBuffer(s);
    //Sの1文字目から(N-1)/2文字目までからなる文字列
    String s_sub_bf = s.substring(0,n/2);
    StringBuffer s_rev_bf = new StringBuffer(s_sub_bf);
    //Sの(N+3)/2文字目からN文字目までからなる文字列
    String s_sub_af = s.substring((n+2)/2,n);
    StringBuffer s_sb_af = new StringBuffer(s_sub_af);
    System.out.println(s.equals(s_sb.reverse().toString()) &&
      s_sub_bf.equals(s_rev_bf.reverse().toString()) && 
                       s_sub_af.equals(s_sb_af.reverse().toString())?
                       "Yes":"No");
  }
}