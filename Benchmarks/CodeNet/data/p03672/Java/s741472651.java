import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String S = sc.next();

    sc.close();

    int[] count = new int[26];

    for (int i = 0; i < S.length(); i++) {
      count[(int) S.charAt(i) - 97]++;
    }

    for (int i = S.length() - 1; 0 <= i; i--) {

      count[(int) S.charAt(i) - 97]--;
      
      boolean valid = true; 
      
      for (int j = 0; j < 26; j++) {
        if(count[j] % 2 != 0){
          valid = false;
          break;
        }
      }
      
      if (valid) {
        System.out.println(i);
        break;
      }

    }

  }

}