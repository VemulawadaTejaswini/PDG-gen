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

    // 累積和
    int[] ac = new int[N+1];
    ac[0] = 0;
    ac[1] = 0;

    for (int i = 1; i < N; i++){
      if (s[i-1].equals("A") && s[i].equals("C")) {
        ac[i+1] = ac[i] + 1; 
      } else {
        ac[i+1] = ac[i];
      }
    }

    //0 1 2 3 4 5 6 7 8
    //0 0 1 1 2 2 2 3 3
    // A C A C T A C G 
    // 1 2 3 4 5 6 7 8

    for (int i = 0; i < Q; i++){
      count = ac[r[i]] - ac[l[i]];
      System.out.println(count);
    }

  }

}