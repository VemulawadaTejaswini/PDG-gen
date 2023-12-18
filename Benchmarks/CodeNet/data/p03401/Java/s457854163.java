import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pointCount = sc.nextInt();
    int[] coordinate = new int[pointCount];
    int currentCoordinate;
    int cost;
    int i;

    for (i = 0; i<pointCount; i++) {
      coordinate[i] = sc.nextInt();
    }
    for (int j=0; j<pointCount; j++) {
      cost = 0;
      currentCoordinate = 0;
      for (i = 0; i<pointCount; i++) {
        if (i==j) {
          continue;
        }
        cost += Math.abs(currentCoordinate - coordinate[i]);
        currentCoordinate = coordinate[i];
      }
      cost += Math.abs(currentCoordinate - 0);
      System.out.println(cost);
    }

  }
}