import java.util.Scanner;

public class Main {
  public static void main (String[] args) { 
    Scanner input = new Scanner(System.in);
    
    while (input.hasNext()) {
      int N = input.nextInt();
      int[][] happiness = new int[N][3];
      
      for (int i = 0; i < happiness.length; ++i) {
        for (int j = 0; j < happiness[i].length; ++j) {
          happiness[i][j] = input.nextInt();
        }
      }
      
      for (int i = 1; i < happiness.length; ++i) {
        for (int j = 0; j < happiness[i].length; ++j) {
          int maxPrev = 0;
          for (int k = 0; k < happiness[i].length; ++k) {
            if (j != k) {
              maxPrev = Math.max(maxPrev, happiness[i - 1][k]);
            }
          }
            
          happiness[i][j] += maxPrev;
        }
      }
      
      int maxHappiness = 0;
      for (int i = 0; i < happiness[N - 1].length; ++i) {
        maxHappiness = Math.max(maxHappiness, happiness[N-1][i]);
      }
      
      System.out.println(maxHappiness);
    }
  }
}