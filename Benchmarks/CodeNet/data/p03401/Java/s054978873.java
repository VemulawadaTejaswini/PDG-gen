import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pointCount = sc.nextInt();
    int[] coordinate = new int[pointCount];
    int currentCoordinate = 0;
    int cost = 0;
    int tmp = 0;

    for (int i = 0; i<pointCount; i++) {
      coordinate[i] = sc.nextInt();
    }
    for (int j=0; j<pointCount; j++) {
      cost = 0;
      currentCoordinate = 0;
      for (int i = 0; i<pointCount; i++) {
        if (i==j) {
          continue;
        }
        tmp = currentCoordinate - coordinate[i];
        cost += tmp<0 ? tmp*-1: tmp;
        currentCoordinate = coordinate[i];
      }
      tmp = currentCoordinate - 0;
      cost += tmp<0 ? tmp*-1: tmp;
      System.out.println(cost);
    }

  }
}
