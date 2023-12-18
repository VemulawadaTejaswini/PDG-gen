import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    switch (s) {
      case "A":
        System.out.println("T");
        break;
      case "c":
        System.out.println("G");
        break;
      case "G":
        System.out.println("C");
        break;
      case "T":
        System.out.println("A");
        break;
    }

  }

}
