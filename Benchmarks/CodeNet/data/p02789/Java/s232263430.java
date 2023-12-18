import java.util.Scanner;

public class Main{

public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  String cases = scanner.next();
  String did = scanner.next();
  
  if (cases.equals(did)) {
    System.out.print("Yes");
  } else {
    System.out.print("No");
  }
}
}

  