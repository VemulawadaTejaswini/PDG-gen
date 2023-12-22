import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int answer = 0;
    
    for (int i = 1; i < 11; i++) {
      int bill = 1000*i;
      if (num > bill) {
      	continue;  
      } else {
       	answer = bill-num;
        break;
      }
    }
    System.out.println(answer);
  }
}