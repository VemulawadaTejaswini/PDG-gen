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
      int count = 1;
      for(Integer j : at.get(s.charAt(i) - 'a')){
        if(i > j || j - i < 1){
          continue;
        }
        ++count;
        if(2 * count > j - i + 1){
          System.out.println((i + 1) + " " + (j + 1));
          return;
        }
      }
    }

    System.out.println("-1 -1");
  }
}