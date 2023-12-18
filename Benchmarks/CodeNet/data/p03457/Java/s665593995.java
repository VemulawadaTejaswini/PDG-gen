import java.util.Scanner;
import java.util.Objects;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    final Scanner scanner = new Scanner(System.in);

    final int N = scanner.nextInt();
    PlanEntry[] plan = new PlanEntry[N + 1];
    plan[0] = new PlanEntry(0, 0, 0);

    for (int i = 1; i <= N; i++) {
      plan[i] = new PlanEntry(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

    for (int i = 0; i < N; i++) {
      if (!canTravel(plan[i], plan[i + 1])) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");

  }
  public static boolean canTravel(final PlanEntry from, final PlanEntry to) {
    // distance
    final int dist = Math.abs(from.getX() - to.getX())
        + Math.abs(from.getY() - to.getY());
    if (dist > to.getTime() - from.getTime()) {
      return false;
    }
    // position
    return to.getTime() % 2 == (to.getX() + to.getY()) % 2;
  }

}
class PlanEntry {

  private int time;
  private int x;
  private int y;
  public PlanEntry(final int time, final int x, final int y) {
    this.time = time;
    this.x = x;
    this.y = y;
  }
  public int getTime() {
    return this.time;
  }
  public int getX() {
    return this.x;
  }
  public int getY() {
    return this.y;
  }
  @Override
  public String toString() {
    return "PlanEntry [time = " + this.time + ", x = " + this.x + ", y = " + this.y + "]";
  }
  @Override
  public boolean equals(final Object object) {
    if (object == null) {
      return false;
    }
    if (object == this) {
      return true;
    }
    if (!(object instanceof PlanEntry)) {
      return false;
    }
    final PlanEntry other = (PlanEntry) object;
    return Objects.equals(this.time, other.time)
        && Objects.equals(this.x, other.x)
        && Objects.equals(this.y, other.y);
  }
  @Override
  public int hashCode() {
    return Objects.hash(this.time, this.x, this.y);
  }

}
