import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    
    int a = sc.nextInt();
    
    int b = sc.nextInt();
    
    int c = sc.nextInt();
 
    int previousResultSum = 0;
    for (int i = 0; i < a - 1; i++) {
      previousResultSum += sc.nextInt();
    }
 
    int result = -1;
    for (int i = 0; i <= b; i++) {
      if ((previousResultSum + i) / a >= c) {
        result = i;
        break;
      }
    }
    System.out.println(result);
  }
}