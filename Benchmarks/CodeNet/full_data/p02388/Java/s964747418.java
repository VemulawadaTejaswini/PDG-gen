import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextint();
    int y = x * x * x;
    System.out.println(y);
  }
}