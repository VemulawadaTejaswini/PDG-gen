import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String result = "Bob";

        if (a == 1 && b != 1) {
          result = "Alice";
        } else if (a > b && b != 1) {
          result = "Alice";
        } else if (a == b) {
          result = "Draw";
        }
        System.out.println(result);
    }
}
