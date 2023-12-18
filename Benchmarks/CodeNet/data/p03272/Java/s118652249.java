import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    
    int N = stdIn.nextInt();
    int i = stdIn.nextInt();
    
    System.out.print(N - i + 1);
  }
}