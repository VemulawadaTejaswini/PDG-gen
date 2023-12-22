import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = null;
    
    line = scanner.nextLine();
    int oniPlace = Integer.parseInt(line.split(" ")[0]);
    int oniWalk = Integer.parseInt(line.split(" ")[1]);

    line = scanner.nextLine();
    int playerPlace = Integer.parseInt(line.split(" ")[0]);
    int playerWalk = Integer.parseInt(line.split(" ")[1]);
    
    int sec = Integer.parseInt(scanner.nextLine());


    int oniMove = (sec * oniWalk);
    int playerMove = (sec * playerWalk);

    
    if (oniPlace < playerPlace) {
	  oniPlace += oniMove;
      playerPlace += playerMove;
      if (oniPlace >= playerPlace) {
      	System.out.println("YES");
      } else {
      	System.out.println("NO");
      }
    } else {
	  oniPlace -= oniMove;
      playerPlace -= playerMove;
      if (oniPlace <= playerPlace) {
      	System.out.println("YES");
      } else {
      	System.out.println("NO");
      }
    }
    
    
  }
}
