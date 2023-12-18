import java.util.Scanner;
import java.util.stream.Stream;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String[] c = s.split(" ");
    int[] n = Stream.of(c).mapToInt(Integer::parseInt).toArray();
    int ans = n[0] * n[1];
    if (ans % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
}