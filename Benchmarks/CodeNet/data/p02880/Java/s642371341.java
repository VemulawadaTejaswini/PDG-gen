import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        String ans = "No";
        for (int i = 1; i < 10; i++) {
            if (ans == "Yes") break;
            for (int j = 1; j < 10; j++) {
               if (N == i * j )  {
                   ans = "Yes";
                   break;
               }
            }
        }

        System.out.println(ans);
        s.close();
    }
    
}