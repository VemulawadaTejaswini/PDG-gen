import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner dataScanner = new Scanner(System.in);
    int data = Integer.parseInt(dataScanner.nextLine());
    int count = 0;
    if (data % 2 == 1) count ++;
    if (data / 100 == 1) count ++;
    if ((data % 100) / 10 == 1) count ++;
    System.out.println(count);
  }
}
