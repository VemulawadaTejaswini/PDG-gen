import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var count = scanner.nextInt();
    var numbers = new ArrayList<Number>();
    for (int i = 0; i < count; i++) {
      var read = scanner.next();
      var index = read.indexOf('.');
      var left = read.substring(0, (index == -1 ? read.length() : index));
      String right = index == -1
        ? ""
        : read.substring(index + 1, read.length());
      var parsedRight = right.isEmpty()
        ? 0
        : Long.parseLong(right);
      var howManyMultipled = parsedRight == 0 
        ? 1 
        : pow(10, right.length());
      var decimal = parsedRight == 0
        ? Long.parseLong(left)
        : Long.parseLong(left + right);
      var num = new Number();
      num.convertedToDecimal = decimal;
      num.howManyMultipled = howManyMultipled;
      numbers.add(num);
    }
    var result = 0;
    for (int i = 0; i < numbers.size() - 1; i++) {
      for (int g = i + 1; g < numbers.size(); g++) {
        var num1 = numbers.get(i);
        var num2 = numbers.get(g);
        var multipled = num1.convertedToDecimal * num2.convertedToDecimal;
        //System.out.println("num1: " + num1);
        //System.out.println("num2: " + num2);
        //System.out.println("multi: " + multipled);
        if (multipled % (num1.howManyMultipled * num2.howManyMultipled) == 0) {
          //System.out.println("yes");
          result++;
        }
      }
    }
    System.out.println(result);
  }

  private static int pow(int a, int count) {
    var result = a;
    for (int i = 1; i < count; i++) {
      result = result * a;
    }
    return result;
  }

  private static class Number {
    long convertedToDecimal;
    long howManyMultipled;

    @Override
    public String toString() {
      return convertedToDecimal + " " + howManyMultipled;
    }
  }
}