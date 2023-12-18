import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    float R = stdIn.nextFloat();
    float G = stdIn.nextFloat();

    float answer = 2 * G - R;

    System.out.println(answer);
  }
}
