import java.util.Arrays;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.next());
    A[] a = new A[N];
    B[] b = new B[N];
    for (int i = 0; i < N; i++) {
      a[i] = new A(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next()));
    }
    for (int i = 0; i < N; i++) {
      b[i] = new B(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next()));
    }
    Arrays.sort(a);
    Arrays.sort(b);
    boolean[] isUsedA = new boolean[N];
    Arrays.fill(isUsedA, false);
    int ans = 0;
    for (int idxB = 0; idxB < N; idxB++) {
      for (int idxA = N - 1; idxA >= 0; idxA--) {
        if (a[idxA].getX() < b[idxB].getX() && a[idxA].getY() < b[idxB].getY() && isUsedA[idxA] == false) {
          ans++;
          isUsedA[idxA] = true;
          break;
        }
      }
    }
    System.out.println(ans);
  }

  public static class B implements Comparable<B> {
    private int X;
    private int Y;

    public B(int X, int Y) {
      this.setX(X);
      this.setY(Y);
    }

    public int getX() {
      return this.X;
    }

    public void setX(int x) {
      this.X = x;
    }

    public int getY() {
      return this.Y;
    }

    public void setY(int y) {
      this.Y = y;
    }

    @Override
    public int compareTo(B b) {
      return this.getX() - b.getX();
    }
  }

  public static class A implements Comparable<A> {
    private int X;
    private int Y;

    public A(int X, int Y) {
      this.setX(X);
      this.setY(Y);
    }

    public int getX() {
      return this.X;
    }

    public void setX(int x) {
      this.X = x;
    }

    public int getY() {
      return this.Y;
    }

    public void setY(int y) {
      this.Y = y;
    }

    @Override
    public int compareTo(A a) {
      return this.getY() - a.getY();
    }
  }
}
