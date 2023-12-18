import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int[] group2 = {4,6,9,11};
    String ret = "Yes";
    if (x == 2 || y == 2) {
      ret = "No";
    } else if (Arrays.stream(group2).allMatch(e -> e == x || e == y)) {
      ret = "No"; 
    }
    System.out.println(ret);
  }
}