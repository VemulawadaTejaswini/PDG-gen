import java.util.*;

public class Main{
  public static void main(String[] args) {
    Set colorSet = new Set();
    Scanner sc = new Scanner(System.in);
    int color1 = sc.nextInt();
    int color2 = sc.nextInt();
    int color3 = sc.nextInt();

    colorSet.add(color1);
    color.add(color2);
    colorSet.add(color3);

    int[] colorList = colorSet.toArray();
    System.out.println(colorList.length);
  }
}
