import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String tommorow = "";
    switch (sc.next()) {
      case "Sunny":
        tommorow = "Cloudy";
        break;
      case "Cloudy":
        tommorow = "Rainy";
        break;
      case "Rainy":
        tommorow = "Sunny";
        break;
    }
    System.out.println(tommorow);
  }
}