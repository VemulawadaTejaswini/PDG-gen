import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    long K = sc.nextInt();

    sc.close(); 

    String[] s = S.split("");

    long count = 0;
    long r = 0;
    boolean[] isChange = new boolean[s.length];
    isChange[0] = false;

    for (int i = 0; i < s.length; i++) {
      if (i == s.length - 1){
        if (isChange[i] == false) {
          if (s.length == 1) {
            r = K / 2;
          } else {
            if (s[0].equals(s[s.length -1])) {
              if (isChange[i-1]) { 
                r = K / 2;
              } else if (isChange[1]){
                r = 0;
              } else {
                r = K - 1;
              }
            }
          }
        }
      } else {
        if (s[i].equals(s[i+1]) && (isChange[i] == false)) {
          count++;
          isChange[i+1] = true;
        } else {
          isChange[i+1] = false;
        }
      }
    }

    System.out.println(count * K + r);

  }

}