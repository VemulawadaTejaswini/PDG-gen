import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    boolean[][] taiou = new boolean[26][26];
    int[] countS =new int[26];
    int[] countT =new int[26];
    int check =0;
    for (int i =0; i<S.length(); i++) {
      taiou[(int)S.charAt(i) - 'a'][(int)T.charAt(i) - 'a'] = true;
    }
    for (int i =0; i<26; i++) {
      for (int j =0; j<26; j++) {
        if (taiou[i][j]) countS[i]++;
        if (taiou[j][i]) countT[i]++;
      }
      if (countS[i] >= 2 || countT[i] >= 2) check++;
    }
    if (check >= 2) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}