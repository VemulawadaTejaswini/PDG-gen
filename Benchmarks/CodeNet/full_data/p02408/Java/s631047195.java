import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static int suit_int(String suit)
  {
    switch(suit)
    {
      case "S":
        return 0;
      case "H":
        return 1;
      case "C":
        return 2;
      case "D":
        return 3;
      default:
        System.out.print("ERROR");
        return -1;
    }
  }

  public static String suit_str(int suit)
  {
    switch (suit) {
      case 0:
        return "S";
      case 1:
        return "H";
      case 2:
        return "C";
      case 3:
        return "D";
      default:
        System.out.println("ERROR");
        return "ERROR";
    }
  }

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    boolean a[][] = new boolean[4][13];
    for (int i = 0; i < n; i++) {
      int suit = suit_int(scan.next());
      int num = scan.nextInt()-1;
      a[suit][num] = true;
    }
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 13; j++) {
        if(a[i][j]) continue;
        System.out.printf("%s %d\n",suit_str(i),j+1);  
      }
    }
    scan.close();
  }
}

