import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    sc.close();

    String[] S = s.split("");

    String result = "Yes";

    for (int i = 0; i < S.length; i++) {
      if (i % 2 == 0) {
        if(!(S[i].equals("R")) && !(S[i].equals("U")) && !(S[i].equals("D"))) {
          result = "No";
          break;
        }
      } else {
        if(!(S[i].equals("L")) && !(S[i].equals("U")) && !(S[i].equals("D"))) {
          result = "No";
          break;
        }
      }
    } 

    System.out.println(result);

  }

}