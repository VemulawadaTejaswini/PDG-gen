import java.util.Scanner;

public class Main {

   public static void main(String args[]) {


      Scanner scan = new Scanner(System.in);

      int a = scan.nextInt();
      int b = scan.nextInt();
      int n = scan.nextInt();

      int max = 0;

     for (int i = 0; i <= n; i++) {
        int ans;

        int floor1 = a * i / b;

        int floor2 = i / b;

        ans = floor1 - a * floor2;

        if (max < ans) {
            max = ans;
        }
     }

     System.out.println(String.valueOf(max));


}
}

