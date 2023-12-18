import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int hint = sc.nextInt();
    
    int max = hint + num - 1;
    int min = hint - num + 1;
    
    for(int i=min;i<=max;i++) {
      System.out.print(i);
      System.out.print(" ");
    }
  }
}