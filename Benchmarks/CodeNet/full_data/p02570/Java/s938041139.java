import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int distance = s.nextInt();
    int timeRequired = s.nextInt();
    int speed = s.nextInt();
    s.close();
    System.out.println(
      isHeOnTime(distance, speed, timeRequired) ? "Yes" : "No"
    );
  }

  private static boolean isHeOnTime(int distance, int speed, int timeRequired) {
    int calculatedDistance = speed * timeRequired;
    return distance <= calculatedDistance;
  }
}
