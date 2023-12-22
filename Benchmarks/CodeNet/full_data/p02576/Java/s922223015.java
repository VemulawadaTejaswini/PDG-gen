import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();
    
    int countOfBake = Takoyaki.getCountOfBake(n, x);
    int time = Takoyaki.getTimeOfBake(t, countOfBake);
    System.out.println(time);
  }
  static class Takoyaki {
    public static int getCountOfBake(int n, int x) {
      if (n < x) {
        return 1;
      }

      return (n/x)+(n%x);
    }
  
    public static int getTimeOfBake(int unitTime, int countOfBake) {
      return unitTime * countOfBake;
    }
  }
}
