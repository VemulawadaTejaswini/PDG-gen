import java.util.Scanner;
 
class Test {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int i = Integer.parseInt(scanner);
    int j = (i/2)+(i%2);
    System.out.println(j);
    scanner.close();
  }
}