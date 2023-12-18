import java.util.Scanner;
import java.util.HashSet;

class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int preCounter = 0;
    int counter = 0;

    for(int i = 1; i < N; i++) {
      String mae = S.substring(0, i);
      String ato = S.substring(i, N);
      mae = removeDup(mae);
      ato = removeDup(ato);
      


      preCounter = 0;


      for(int n = 0; n < mae.length(); n++) {

        char maemoji = mae.charAt(n);

        for(int t = 0; t < ato.length(); t++) {
          char atomoji = ato.charAt(t);
          if (maemoji == atomoji) {
            preCounter++;
          }
        }
      }
      if(counter < preCounter) {
        counter = preCounter;
      }
    }
    System.out.println(counter);
    return;
  }

  private static String removeDup(String str){
    String result = new String("");

    for (int i = 0; i < str.length(); i++) {
        if (!result.contains("" + str.charAt(i))) {
            result += "" + str.charAt(i);
        }
    }

    return result;
  }
}
