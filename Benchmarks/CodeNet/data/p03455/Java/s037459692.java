import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws java.lang.Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] intArray = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

    int a = intArray[0];
    int b = intArray[1];

    if (a*b % 2 == 0){
      system.out.println(Even);
    } else {
      system.out.println(Odd);
    }
  }
}