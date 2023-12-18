import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    String sa = scanner.next();
    String sb = scanner.next();
    String sc = scanner.next();

    scanner.close();

    String[] SA = sa.split("");
    String[] SB = sb.split("");
    String[] SC = sc.split("");

    int currentSA = 0;
    int currentSB = 0;
    int currentSC = 0;

    // a:Aの番、b:Bの番、c:Cの番
    String turn = "a";

    String winner = "";

    while (winner.equals("")) {
      if (turn.equals("a")) {
        if (currentSA == SA.length){
          winner = "A";
        } else {
          turn = SA[currentSA];
          currentSA++;
        }
      } else if(turn.equals("b")) {
        if (currentSB == SB.length){
          winner = "B";
        } else {
          turn = SB[currentSB];
          currentSB++;
        }
      } else {
        if (currentSC == SC.length){
          winner = "C";
        } else {
          turn = SC[currentSC];
          currentSC++;
        }
      }
    }

    System.out.println(winner);

  }

}