import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int variable = scanner.nextInt();
    int basisNumber = scanner.nextInt();
   
    if (variable < basisNumber) {
        System.out.println(0);
    } else {
    	System.out.println(10);
    }
  }
}
