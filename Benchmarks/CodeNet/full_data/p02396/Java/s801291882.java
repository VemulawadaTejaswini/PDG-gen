import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //int n = sc.nextInt();
    int[] intArray = Arrays.stream(sc.nextLine().split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();
    for(int i=0; i<intArray.length; i++)
    {
      out.printf("Case %d: %d\n",i,intArray[i]);
    }
  }
}
