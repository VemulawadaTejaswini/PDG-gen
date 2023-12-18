import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    try(
      Scanner scanner = new Scanner(System.in);) {
      int numPersons = scanner.nextInt();
      scanner.nextInt();
      Map<Integer, Integer> foods = new HashMap<>();
      for (int personIndex = 0; personIndex < numPersons; personIndex++) {
        int numFoods = scanner.nextInt();
        for (int foodIndex = 0; foodIndex < numFoods; foodIndex++) {
          Integer food = scanner.nextInt();
          if (foods.containsKey(food)) {
            foods.put(food, foods.get(food) + 1);
          } else {
            foods.put(food, 1);
          }
        }
      }
      int count = 0;
      for (Integer food: foods.keySet()) {
        if (foods.get(food).equals(numPersons)) {
          count++;
        }
      }
      System.out.println(count);
    }
  }
}