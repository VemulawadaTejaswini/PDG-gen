import java.util.Scanner;

/*
   input:
       3
       5
       11
       7
       8
       19
       0

   output:
       Case 1: 3
       Case 2: 5
       Case 3: 11
       Case 4: 7
       Case 5: 8
       Case 6: 19
*/

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = 1, a;
    while (true) {
      a = scan.nextInt();
      if (a == 0) break;
      System.out.printf("Case %d: %d\n", i++, a);
    }
  }
}
