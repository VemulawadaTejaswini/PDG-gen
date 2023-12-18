
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

    //Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int count = cin.nextInt();

    HashMap<Integer, Integer> even = new HashMap<Integer, Integer>();
    HashMap<Integer, Integer> odd = new HashMap<Integer, Integer>();
    for (int i = 0; i<count; i++) {
      int num = cin.nextInt();
      if (i%2==0) {
        if (even.containsKey(num)) {
          int temp = even.get(num);
          even.put(num, temp + 1);
        } else {
          even.put(num, 1);
        }
      }
      else {
        if (odd.containsKey(num)) {
          int temp = odd.get(num);
          odd.put(num, temp + 1);
        } else {
          odd.put(num, 1);
        }
      }
    }

    int firstEven = 0;
    int secondEven = 0;
    int firstEvenT = 0;
    int secondEvenT = 0;
    int firstOdd = 0;
    int secondOdd = 0;
    int firstOddT = 0;
    int secondOddT = 0;

    for (Map.Entry<Integer, Integer> entry : even.entrySet()) {
      int item = entry.getKey();
      int index = entry.getValue();
      if (item > firstEven) {
        secondEven = firstEven;
        secondEvenT = firstEvenT;
        firstEven = item;
        firstEvenT = index;
      }
      else if (item > secondEven) {
        secondEven = item;
        secondEvenT = index;
      }
    }

    for (Map.Entry<Integer, Integer> entry : odd.entrySet()) {
      int item = entry.getKey();
      int index = entry.getValue();
      if (item > firstOdd) {
        secondOdd = firstOdd;
        secondOddT = firstOddT;
        firstOdd = item;
        firstOddT = index;
      }
      else if (item > secondOdd) {
        secondOdd = item;
        secondOddT = index;
      }
    }

    //System.out.println(secondEven+" "+secondEvenT+" "+secondOdd+" "+secondOddT);

    if (firstEven != firstOdd) {
      System.out.println(count - firstEvenT - firstOddT);
    }
    else {
      if (firstEvenT >= firstOddT) {
        System.out.println(count - firstEvenT - secondOddT);
      }
      else {
        System.out.println(count - firstOddT - secondEvenT);
      }
    }

  }

}