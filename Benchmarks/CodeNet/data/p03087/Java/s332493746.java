import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int Q = sc.nextInt();
    String S = sc.next();
    
    int[] l = new int[Q];
    int[] r = new int[Q];

    for (int i = 0; i < Q; i++) {
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }

    sc.close();

    String[] s = S.split("");

    int count = 0;

    boolean hasA = false;

    for (int i = 0; i < Q; i++){
      for (int j = l[i] - 1; j < r[i]; j++){
        if (hasA){
          if (s[j].equals("C")) {
            hasA = false;
            count++;
          }
        } else {
          if (s[j].equals("A")) {
            hasA = true;
          }
        }
      }
      System.out.println(count);
      count = 0;
    }

  }

}