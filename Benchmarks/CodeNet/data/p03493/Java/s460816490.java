import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Main application = new Main();
    application.run();
  }
  public void run() {
    final Places places = this.scanFromStdin();
    final int marbleCount = new MarbleCounter().count(places);
    printMarbleCount(marbleCount);
  }
  Places scanFromStdin() {
    final Scanner scanner = new Scanner(System.in);
    final String placesString = scanner.next();
    final boolean firstPlace = placesString.charAt(0) == '1';
    final boolean secondPlace = placesString.charAt(1) == '1';
    final boolean thirdPlace = placesString.charAt(2) == '1';
    return new Places(firstPlace, secondPlace, thirdPlace);
  }
  void printMarbleCount(int count) {
    System.out.println(count);
  }
}
class Places {
  public final boolean firstPlace;
  public final boolean secondPlace;
  public final boolean thirdPlace;
  public Places(boolean firstPlace, boolean secondPlace, boolean thirdPlace) {
    this.firstPlace = firstPlace;
    this.secondPlace = secondPlace;
    this.thirdPlace = thirdPlace;
  }
}
class MarbleCounter {
  public int count(Places places) {
    int count = 0;
    if (places.firstPlace) {
      count++;
    }
    if (places.secondPlace) {
      count++;
    }
    if (places.thirdPlace) {
       count++;
    }
    return count;
  }
}
