import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(Integer.valueOf(input.next()));
      list.add(Integer.valueOf(input.next()));
      list.add(Integer.valueOf(input.next()));
      list.sort(Comparator.naturalOrder());
      System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
  }

}
