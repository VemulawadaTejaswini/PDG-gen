import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int E = sc.nextInt();

    sc.close();

    int[][] array = new int[5][3];

    array[0][0] = A;
    array[1][0] = B;
    array[2][0] = C;
    array[3][0] = D;
    array[4][0] = E;
    if (A % 10 != 0) {
      array[0][1] = A % 10;
      array[0][2] = A + (10 - A % 10);
    } else {
      array[0][1] = 10;
      array[0][2] = A;
    }
    if (B % 10 != 0) {
      array[1][1] = B % 10;
      array[1][2] = B + (10 - B % 10);
    } else {
      array[1][1] = 10;
      array[1][2] = B;
    }
    if (C % 10 != 0) {
      array[2][1] = C % 10;
      array[2][2] = C + (10 - C % 10);
    } else {
      array[2][1] = 10;
      array[2][2] = C;
    }
    if (D % 10 != 0) {
      array[3][1] = D % 10;
      array[3][2] = D + (10 - D % 10);
    } else {
      array[3][1] = 10;
      array[3][2] = D;
    }
    if (E % 10 != 0) {
      array[4][1] = E % 10;
      array[4][2] = E + (10 - E % 10);
    } else {
      array[4][1] = 10;
      array[4][2] = E;
    }

    Arrays.sort(array, (a,b) -> Integer.compare(b[1],a[1]));

    int sum = 0;

    for (int i = 0; i < 5; i++) {
      if (i == 4) {
        sum += array[i][0];
      } else {
        sum += array[i][2];
      }
    }

    System.out.println(sum);

  }

}