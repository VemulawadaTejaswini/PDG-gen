import java.util.*;
public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    
    int max = 0;
    for (int i = 0; i < S.length(); i++) {
      for (int j = i; j < S.length(); j++) {
        int length = getACGTLen(S, i, j);
        if (max < length) {
          max = length;
        }
      }
    }
    System.out.println(max);
  }
  
  private static int getACGTLen(String s, int from, int to) {
    int length = 0;
    for (int i = from; i <= to; i++) {
      if (ACGT(s.charAt(i))) {
        length++;
      } else {
        return 0;
      }
    }
    return length;
  }
  
  private static boolean ACGT(char c) {
    return c == 'A' || c == 'C' || c == 'G' || c == 'T';
  }
}