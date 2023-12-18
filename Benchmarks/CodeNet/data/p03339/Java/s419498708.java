import java.util.Scanner;

public class Main {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    
    while (input.hasNext()) {
      int N = input.nextInt();
      String S = input.next();
      
      int[] wBefore = new int[N];
      for (int i = 1; i < S.length(); ++i) {
         if (S.charAt(i - 1) == 'W') {
          wBefore[i] +=wBefore[i - 1] + 1;
        } else {
          wBefore[i] = wBefore[i - 1];
        }
      }

      int[] eAfter = new int[N];
      for (int i = S.length() - 2; i >= 0 ; --i) {
         if (S.charAt(i + 1) == 'E') {
          eAfter[i] += eAfter[i + 1] + 1;
        } else {
          eAfter[i] = eAfter[i + 1];
        }
      }
      
      int minChange = Integer.MAX_VALUE;
      for (int i = 0; i < S.length(); ++i) {
        minChange = Math.min(minChange, wBefore[i] + eAfter[i]);
      }

      System.out.println(minChange);
    }
  }
}