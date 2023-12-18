import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height, width, black_height, black_width, area;
    height = Double.parseDouble(sc.next());
    width = Double.parseDouble(sc.next());
    black_height = Double.parseDouble(sc.next());
    black_width = Double.parseDouble(sc.next());
    area = (height - black_height) * (width - black_width);
    System.out.println(area);
  }
}
