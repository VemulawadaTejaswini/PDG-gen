import java.util.*;
 
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int rows = scanner.nextInt();
    int cols = scanner.nextInt();
    int constant = scanner.nextInt();
    
    int[] code = new int[cols];
    for (int ix = 0; ix < cols; ix++) {
      code[ix] = scanner.nextInt();
    }
    
    int matches = 0;
    for (int row = 0; row < rows; row++) {
      int result = 0;
      for (int col = 0; col < cols; col++) {
        result += scanner.nextInt() * code[col];
      }
      
      if (result + constant > 0) matches++;
    }
    
    System.out.println(matches);
  }
}