import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int i = 1;
    int check = 0;
    while (i<100) {
      System.out.println(A * i % B); 
      if(A * i % B == C) {
        check = 1;
        break;
      }
      i++;
    }
    if (check == 1) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
   }
}