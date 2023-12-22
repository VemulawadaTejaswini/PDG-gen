import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    ArrayList<Integer> spade = new ArrayList<Integer>();
    ArrayList<Integer> heart = new ArrayList<Integer>();
    ArrayList<Integer> club = new ArrayList<Integer>();
    ArrayList<Integer> dia = new ArrayList<Integer>();
    for (int i = 1; i <= 13; i++) {
      spade.add(i);
      heart.add(i);
      club.add(i);
      dia.add(i);
    }

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    for (int i = 0; i < n; i++) {
      String sign = scan.next();
      int num = scan.nextInt();

      switch (sign) {
      case "S":
        spade.remove((Object) num);
        break;

      case "H":
        heart.remove((Object) num);
        break;

      case "C":
        club.remove((Object) num);
        break;

      case "D":
        dia.remove((Object) num);
        break;
      }

    }

    int j = 0;
    while (j < spade.size()) {
      System.out.println("S " + spade.get(j));
      j++;
    }
    
    j = 0;
    while (j < heart.size()) {
      System.out.println("H " + heart.get(j));
      j++;
    }
    
    j = 0;
    while (j < club.size()) {
      System.out.println("C " + club.get(j));
      j++;
    }
    
    j = 0;
    while (j < dia.size()) {
      System.out.println("D " + dia.get(j));
      j++;
    }

  }

}

