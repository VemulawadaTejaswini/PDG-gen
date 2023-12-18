import java.util.Scanner;
import java.lang.String;
 
public class Main {
  
  public static void main (String[] arg) {
    Scanner sc = new Scanner(System.in);
    rockpaper(sc);
    sc.close();
  }
  
  public static void rockpaper(Scanner sc) {
    String tcdSequence = sc.next();
    int tcdLength = tcdSequence.length();
    char[] acdSequence = new char[tcdLength];
    for (int i = 0; i < acdSequence.length; i++) {
      if (i % 2 == 0) {
        acdSequence[i] = 'g';
      } else {
        acdSequence[i] = 'p';
      }
    }
    
    int acdScore = 0;
    for (int k = 0; k < tcdSequence.length(); k++) {
      if ((tcdSequence.charAt(k) == 'g') && (acdSequence[k] == 'p')) {
        acdScore++;
      } else if ((tcdSequence.charAt(k) == 'p') && (acdSequence[k] == 'g')) {
        acdScore--;
      }
    }
    
    System.out.println(acdScore);
  }
}