import java.util.Scanner;
import java.util.stream.Stream;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int[] i = Stream.of(S).mapToInt(Integer::parseInt).toArray();
    String ans = "unsafe";
    
    if(i[0] > i[1]){
      ans = "safe";
    }
    
    System.out.println(ans);
  }
}
    