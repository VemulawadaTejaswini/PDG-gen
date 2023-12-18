import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      list.add(Integer.parseInt(scanner.nextLine()));
    }
    int k = Integer.parseInt(scanner.nextLine());
    for (int i = 0; i < list.size() - 1; i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if ((list.get(i) < list.get(j) && (list.get(j) - list.get(i) > k)) || (list.get(i) - list.get(j) > k)) {
          System.out.println(":(");
          return;
        }
      }
    }
    System.out.println("Yay!");
  }
}