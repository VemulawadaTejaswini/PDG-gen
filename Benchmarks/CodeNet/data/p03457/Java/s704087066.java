import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int step = sc.nextInt();
    int posX = 0;
    int posY = 0;
    
    for (int i = 0; i < step; i++) {

      int t = Integer.parseInt(sc.next());
      int x = Integer.parseInt(sc.next());
      int y = Integer.parseInt(sc.next());

      for (int j = i; j < t; j++) {

        if (posX < x) {
          posX++;
        } else if (posX > x) {
          posX--;
        } else if (posY < y) {
          posY++;
        } else if (posY > y) {
          posY--;
        } else {
          posX ++;
        }

      }

      if (!(posX == x && posY == y)) {
        System.out.println("No");
        return;
      }

    }

    System.out.println("Yes");

  }

}