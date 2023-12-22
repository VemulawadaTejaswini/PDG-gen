import java.util.*;
import java.io.*;

public class template {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] intArray = Arrays.stream(sc.nextLine().split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();
    int x = intArray[0];
    int y = intArray[1];

    if(x == y)
    {
      System.out.printf("%d == %d", a, b);
    }
    else if(x < y)
    {
      System.out.printf("%d < %d", a, b);
    }
    else
    {
      System.out.printf("%d > %d", a, b);
    }
  }
}
