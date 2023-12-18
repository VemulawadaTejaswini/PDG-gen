import java.util.Scanner;

public class Main {
  private static String DELIMITER = " ";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String rowLine = scanner.nextLine();
    String rowLineToFill = scanner.nextLine();
    String[] rowLineArray = rowLine.split(DELIMITER);
    String[] rowLineToFillArray = rowLineToFill.split(DELIMITER);
    int rowNum = Integer.valueOf(rowLineArray[0]);
    int lineNum = Integer.valueOf(rowLineArray[1]);
    int rowToFillNum = Integer.valueOf(rowLineToFillArray[0]);
    int lineToFillNum = Integer.valueOf(rowLineToFillArray[1]);
    int cellNum = rowNum * lineNum;

    int filled;
    if (rowNum == rowToFillNum) {
      filled = cellNum;
    } else {
      filled = rowNum * rowToFillNum + (lineNum - rowToFillNum) * lineToFillNum;
    }
    
    int notFilled = cellNum - filled;
    System.out.println(notFilled);
  }
}
