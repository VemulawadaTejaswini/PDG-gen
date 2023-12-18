import java.util.*;

public class Main {

  private long criticalTime = 0; 
  private long people = 0;

  public static void main(String[] args) {
    Main m = new Main();
    m.read();
    m.exec();
  }

  private void read() {
    Scanner scan = new Scanner(System.in);
    people = scan.nextLong();
    criticalTime = people;
    for (int i = 0; i < 5; i++) {
      int time = scan.nextLong();
      if (criticalTime > time) {
        criticalTime = time;
      }
    }
  }

  private void exec() {
    long totalTime = people / criticalTime + 4;
    if (people % criticalTime != 0) {
      totalTime++;
    }
    System.out.println(totalTime);
  }
}