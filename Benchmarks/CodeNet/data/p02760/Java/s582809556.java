import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Cell[][] A = new Cell[3][3];
    A[0][0] = new Cell(sc.nextInt());
    A[0][1] = new Cell(sc.nextInt());
    A[0][2] = new Cell(sc.nextInt());
    A[1][0] = new Cell(sc.nextInt());
    A[1][1] = new Cell(sc.nextInt());
    A[1][2] = new Cell(sc.nextInt());
    A[2][0] = new Cell(sc.nextInt());
    A[2][1] = new Cell(sc.nextInt());
    A[2][2] = new Cell(sc.nextInt());
    int N = sc.nextInt();
    int[] called = new int[10];
    for(int i = 0; i < N; i++ ){
      called[i] = sc.nextInt();
      for (int j = 0; j < 3; j++) {
          for (int k = 0; k < 3; k++) {
              A[j][k].setCalled(called[i]);
          }
      }
    }
    sc.close();

    if ( (A[0][0].isCalled() && A[0][1].isCalled() && A[0][2].isCalled()) ||
         (A[1][0].isCalled() && A[1][1].isCalled() && A[1][2].isCalled()) ||
         (A[2][0].isCalled() && A[2][1].isCalled() && A[2][2].isCalled()) ||
         (A[0][0].isCalled() && A[1][0].isCalled() && A[2][0].isCalled()) ||
         (A[0][1].isCalled() && A[1][1].isCalled() && A[2][1].isCalled()) ||
         (A[0][2].isCalled() && A[1][2].isCalled() && A[2][2].isCalled()) ||
         (A[0][0].isCalled() && A[1][1].isCalled() && A[2][2].isCalled()) ||
         (A[0][2].isCalled() && A[1][1].isCalled() && A[2][0].isCalled()) ) {
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }
    return;
  }
}

class Cell {
    private int num = 0;
    private boolean called;

    public Cell(int my_num) {
        num = my_num;
        called = false;
    }
    public void setCalled(int called_num) {
        if (num == called_num) {
            called = true;
        }
    }
    public boolean isCalled() {
        return called;
    }
}
