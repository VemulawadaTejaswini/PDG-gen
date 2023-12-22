import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    while(s.hasNext()) {
      int n = s.nextInt();
      System.out.println(countCombination(n));
    }   
  }
  public static int countCombination(int n) {
    int count = 0;
    int sumOfIntegers = 0;
    for(int i = 0; i <= 9; i++) {
      for(int j = 0; j <= 9; j++) {
        for(int k = 0; k <= 9; k++) {
          for(int h = 0; h <= 9; h++) {
            sumOfIntegers = i + j + k + h;
            if (sumOfIntegers == n) {
              count++;
            }   
          }   
        }   
      }   
    }   
    return count;
  }
}