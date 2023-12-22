import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      // 準備するよ！
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      String t = sc.next();
      char[] sAry = new char[s.length()];
      char[] tAry = new char[t.length()];

      for(int i=0; i < sAry.length; ++i) sAry[i] = s.charAt(i);
      for(int i=0; i < tAry.length; ++i) tAry[i] = t.charAt(i);

      // 解くよ！
      int ans = 1001;

      // 比較開始位置のfor文（1文字目～S-T+1文字目まで)
      // 注意：この"文字目"は問題文が示す文字数。添え字ではない。
      for(int i=0; i <= sAry.length - tAry.length; ++i) {
        int answk = 0;

        // T文字分比較するよ
        for(int j=0; j<tAry.length; ++j) {
          if(sAry[i+j] != tAry[j]) ++answk;
        }

        if(answk < ans) ans = answk;

      }

      if(ans == 1001) ans = 0;

      System.out.println(ans);

    }
}