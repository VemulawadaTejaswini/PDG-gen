import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  static String s;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    s = sc.next();
    int n = s.length();

    List< List< Integer > > at = new ArrayList< List< Integer > >(26);
    for(int i = 0; i < 26; i++){
      at.add(new ArrayList< Integer >());
    }

    for(int i = 0; i < n; i++){
      at.get(s.charAt(i) - 'a').add(i);
    }

    for(int i = 0; i < n; i++){
      for(Integer j : at.get(s.charAt(i) - 'a')){
        if(i > j || j - i < 1){
          continue;
        }
        if(check(i, j + 1)){
          System.out.println((i + 1) + " " + (j + 1));
          return;
        }
      }
    }

    System.out.println("-1 -1");
  }

  private static boolean check(int i, int j){
    String sub = s.substring(i, j);
    int[] counts = new int[26];
    int n = sub.length();
    for(int k = 0; k < n; k++){
      ++counts[sub.charAt(k) - 'a'];
    }
    for(int k = 0; k < 26; k++){
      if(2 * counts[k] > n){
        return true;
      }
    }
    return false;
  }
}