import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = Integer.parseInt(scanner.nextLine());
    String[] value = scanner.nextLine().split(" ");
    String[] cost = scanner.nextLine().split(" ");
    
    ArrayList list = new ArrayList<>();
    int tmp;
    for (int i = 0; i < num; i++) {
      tmp = 0;
      if ((tmp = Integer.parseInt(value[i]) - Integer.parseInt(cost[i])) > 0) {
        list.add(tmp);
      }
    }
    if (list.size() == 0) {
      System.out.println("0");
    }
    else {
      Collections.sort(list, Comparator.reverseOrder());
      int sum = (Integer)list.get(0) + (Integer)list.get(1);
      System.out.println(sum);
    }
  }
}