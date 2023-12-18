import java.util.Scanner;
public class Main {
  public static int helper(String[] dataArr) {
    int minCount = 0;
    for (String number : dataArr) {
      int num = Integer.parseInt(number);
      int count;
      while (num % 2 == 0 && count < minCount) {
        count++;
      }
      minCount = count;
      if (minCount == 0) return 0;
    }
    return minCount;
  }
  
  public static void main(String[] args) {
    Scanner dataScanner = new Scanner(System.in);
    dataScanner.nextLine();
    String data = dataScanner.nextLine();
    String[] dataArr = data.split(" ");
    int toOut = helper(dataArr);
    System.out.println(toOut);
  }
}
