import java.util.Scanner;
import java.util.Stack;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Stack cars = new Stack();

    while (sc.hasNext()) {
      int carNum = sc.nextInt();

      if (carNum == 0) {
        // Object p = cars.pop();
        System.out.println(cars.pop());
      } else {
        cars.push(new Integer(carNum));
      }
    }
  }
}