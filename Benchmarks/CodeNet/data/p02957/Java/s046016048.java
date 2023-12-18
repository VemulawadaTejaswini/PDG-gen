import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    long result = -1;
    if (A % 2 == B % 2){
      result =(A + B) / 2;
    }

    System.out.println(result < 0 ? "IMPOSSIBLE" : Objects.toString(result, ""));

  }
}
