import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 5 ; i++ ) {
      list.add(sc.nextInt());
    }

    int minDigit = 9;
    int lastOrderI = 0;
    int lastOrder = 0;
    for (int i = 0; i < 5 ; i++ ) {
      int digit = list.get(i) % 10;

      if (digit <= minDigit && digit != 0) {
        minDigit = digit;
        lastOrderI = i;
        lastOrder = list.get(i);
      }
    }

    list.remove(lastOrderI);

    int result = 0;

    for (int i = 0; i < 4 ; i++ ) {
      int order = list.get(i);
      if (order % 10 == 0) {
        result += order;
      } else {
        int plus = 10 - (order % 10);
        result += order + plus;
      }
    }

    result += lastOrder;

    System.out.println(result);
  }
}
