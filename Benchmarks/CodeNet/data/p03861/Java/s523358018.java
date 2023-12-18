import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x = sc.nextInt();
    for(int i = a; i <= b; i++) {
      if(i % x == 0)count++;
    }
    System.out.println(count);
  }
}
