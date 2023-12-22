
import java.util.Scanner;

public class Main {
  public static final void main(String[] args) {
    Rectangle rectangle;
    Circle circle;

    try (Scanner scanner = new Scanner(System.in)) {
      int width = scanner.nextInt();
      int height = scanner.nextInt();
      rectangle = new RectangleImpl(width, height);
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      int center = scanner.nextInt();
      circle = new CircleImpl(x, y, center);
    } catch (Exception e) {
      return;
    }
    if (rectangle.isInCircle(circle)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}

interface Rectangle {
  boolean isInCircle(Circle circle);
}

final class RectangleImpl implements Rectangle {

  private final int width;
  private final int height;

  RectangleImpl(int width, int height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public boolean isInCircle(Circle circle) {
    if (circle.getX() - circle.getCenter() < 0) {
      return false;
    }

    if (circle.getX() + circle.getCenter() > width) {
      return false;
    }

    if (circle.getY() - circle.getCenter() < 0) {
      return false;
    }

    if (circle.getY() + circle.getCenter() > height) {
      return false;
    }
    return true;
  }
}

interface Circle {
  int getX();

  int getY();

  int getCenter();
}

final class CircleImpl implements Circle {
  private final int x;
  private final int y;
  private final int center;


  CircleImpl(int x, int y, int center) {
    this.x = x;
    this.y = y;
    this.center = center;
  }

  @Override
  public int getX() {
    return x;
  }

  @Override
  public int getY() {
    return y;
  }

  @Override
  public int getCenter() {
    return center;
  }
}