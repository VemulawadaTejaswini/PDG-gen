import java.util.*;

class Main {
  public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int X = scanner.nextInt();
         int happiness = 0;
         happiness = (X/500)*1000;
         X = X%500;
         happiness += (X/5)*5;
         System.out.println(happiness);
         scanner.close();
  }
}