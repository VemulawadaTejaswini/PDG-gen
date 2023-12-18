import java.util.*;

public class Main {
  
  private long transport[] = {0,0,0,0,0}
  private long city[] = {0,0,0,0,0,0}
 
  public static void main(String[] args) {
  	Main m = new Main();
    m.read();
    m.exec();
  }
  
  private void read() {
  	Scanner scan = new Scanner(System.in);
    city[0] = scan.nextInt();
    transport[0] = scan.nextInt();
    transport[1] = scan.nextInt();
    transport[2] = scan.nextInt();
    transport[3] = scan.nextInt();
    transport[4] = scan.nextInt();
  }
  
  private void exec() {
    long time = 0;
    while (city[0] > 0 || city[1] > 0 || city[2] > 0 || city[3] > 0 || city[4] > 0 ||) {
      for (i = 0; i < transport.length; i++) {
        next(i);
      }
      time++;
    }
    Sytem.out.println(time);
  }
  
  private void next(int index) {
    if (city[index] <= 0) {
      return;
    }
    if (transport[index] > city[index]) {
      city[index + 1] += city[index];
      city[index] = 0;
    } else {
      city[index + 1] += transport[index];
      city[index] -= transport[index];
    }
  }
}