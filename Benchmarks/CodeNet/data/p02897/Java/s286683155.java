import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int count = 0;
    for (int i = 1;i <= n; i++) {
      if(i%2 == 1) {
       count++; 
      }
    }
    System.out.println(count / n);
  }
}