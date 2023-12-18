import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String aStr = Integer.toString(a);
    int b = sc.nextInt();
    String bStr = Integer.toString(b);

    StringBuilder aResult = new StringBuilder();
    for (int i = 0; i < b; i++) {
      aResult.append(aStr);
    }

    StringBuilder bResult = new StringBuilder();
    for (int i = 0; i < a; i++) {
      bResult.append(bStr);
    }

    List<String> list = new ArrayList<>();
    list.add(aResult.toString());
    list.add(bResult.toString());
    List<String> sortedList = list.stream().sorted().collect(Collectors.toList());

    System.out.println(sortedList.get(0));
  }
}