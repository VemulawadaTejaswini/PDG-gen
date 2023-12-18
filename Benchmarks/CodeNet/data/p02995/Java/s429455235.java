import java.util.Scanner;
import java.util.stream.IntStream;
public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();
    System.out.println(IntStream.rangeClosed(a, b).filter(x -> x % c != 0 && x %d != 0).count());
  }
}