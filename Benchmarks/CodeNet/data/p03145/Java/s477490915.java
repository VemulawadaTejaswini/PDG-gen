import java.util.*;

class Main {
  public static int calculateSurface(int bottom, int height) {
    return bottom * height / 2;
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String line = scanner.nextLine();
    
    String[] values = line.split(" ", 0);
    
    int AB = Integer.parseInt(values[0]); 
    int BC = Integer.parseInt(values[1]);
    int CA = Integer.parseInt(values[2]);
    
    System.out.println(calculateSurface(BC, AB));
  }
}