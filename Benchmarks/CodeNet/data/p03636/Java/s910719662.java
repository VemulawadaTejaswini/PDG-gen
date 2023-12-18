import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    int lineLength = line.length();
    System.out.println(line.substring(0, 1) + (lineLength - 2) + line.substring(lineLength - 1, lineLength));
    
  }
}