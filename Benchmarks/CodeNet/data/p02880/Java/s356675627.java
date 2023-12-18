import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int check =0;
    for (int i =1; i <=9; i++) {
      for (int j =1; j <=9; j++) {
        if (i * j == N) check++;
      }
    }
    if (check == 0) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}