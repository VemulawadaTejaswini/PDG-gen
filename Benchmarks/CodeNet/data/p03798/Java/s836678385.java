
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int p = -1;
 //   String[] ans = new String[n];
    char[] temp = new char[n];
    for(int k = 0; k < 4; k++) {
      int m = k;
      if((m % 2) == 0) {
        temp[0] = 'W';
      } else {
        temp[0] = 'S';
      }
      m /= 2;
      if((m % 2) == 0) {
        temp[1] = 'W';
      } else {
        temp[1] = 'S';
      }
      for(int i = 1; i < (n - 1); i++) {
        if(s.charAt(i) == 'o') {
          if(temp[i] == 'W') {
            if(temp[i - 1] == 'W') {
              temp[i + 1] = 'S';
            } else {
              temp[i + 1] = 'W';
            }
          } else {
            temp[i + 1] = temp[i - 1];
          }
        } else {
          if(temp[i] == 'W') {
            temp[i + 1] = temp[i - 1];
          } else {
            if(temp[i - 1] == 'W') {
              temp[i + 1] = 'S';
            } else {
              temp[i + 1] = 'W';
            }
          }
        }
      }
      int q = 0;
      for(int i = 0; i < n; i++) {
        int a = i - 1;
        int b = i + 1;
        if(i == 0) a = (n - 1);
        if(i == (n - 1)) b = 0;
        if(s.charAt(i) == 'o') {
          if(temp[i] == 'W') {
            if(temp[a] == temp[b]) q = 1;
          } else {
            if(temp[a] != temp[b]) q = 1;
          }
        } else {
          if(temp[i] == 'W') {
            if(temp[a] != temp[b]) q = 1;
          } else {
            if(temp[a] == temp[b]) q = 1;
          }
        }
      }
      if(q == 0) {
        p = 0;
        break;
      } else {
        
      }
    }
    if(p == -1) {
      System.out.println(-1);
    } else {
      System.out.println(new String(temp));
    }
  }
}