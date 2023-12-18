import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();	
      String s = scanner.next();	
      
      String w_char1 = " ";
      String w_char2 = " ";
      int r_cnt = 0;
      
      for (int i = 0;  i < n ; i ++ ) {
        w_char2 = s.substring(i, i + 1);
        if (w_char1.equals(w_char2)){
        }
        else{
          r_cnt ++;
          w_char1 = w_char2;
        }
      }
      
      System.out.println(r_cnt);

      return;
    }
  }
