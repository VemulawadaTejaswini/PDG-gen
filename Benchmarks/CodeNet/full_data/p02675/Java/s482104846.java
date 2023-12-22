import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] arr = new String[]{"pon","pon","hon","bon","hon","hon","pon","hon","pon","hon"};
    System.out.println(arr[sc.nextInt()%10]);
  }
}