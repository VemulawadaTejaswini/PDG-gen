import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    while (sc.hasNext()) {
      list.add(sc.nextInt());
    }
    sc.close();

    for (int i = 0; i < length; i++) {
      ArrayList<Integer> tempList = new ArrayList<>();
      list.forEach(a -> tempList.add(a));
      tempList.remove(i);
      tempList.sort((first, second) -> second.compareTo(first));
      System.out.println(tempList.get(0));
    }
  }

}