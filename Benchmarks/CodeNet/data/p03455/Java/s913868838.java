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

    for (int i = 0; i < N - 1; i++) {
      if (!canTravel(plan[i], plan[i + 1])) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");

  }
  public static boolean canTravel(final PlanEntry from, final PlanEntry to) {
    if (from.equals(to)) {
      return true;
    }
    final int dist = Math.abs(from.getX() - to.getX()) + Math.abs(from.getY() - to.getY());
    if (dist > to.getTime() - from.getTime()) {
      return false;
    }
    final int fromTime = from.getTime();
    final int fromX = from.getX();
    final int fromY = from.getY();
    if (fromX > 0) {
      final PlanEntry candidate = new PlanEntry(fromTime + 1, fromX - 1, fromY);
      if (canTravel(candidate, to)) {
        return true;
      }
    }
    if (fromY > 0) {
      final PlanEntry candidate = new PlanEntry(fromTime + 1, fromX, fromY - 1);
      if (canTravel(candidate, to)) {
        return true;
      }
    }
    final PlanEntry candidate1 = new PlanEntry(fromTime + 1, fromX + 1, fromY);
    if (canTravel(candidate1, to)) {
      return true;
    }
    final PlanEntry candidate2 = new PlanEntry(fromTime + 1, fromX, fromY + 1);
    if (canTravel(candidate2, to)) {
      return true;
    }
    return false;
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
