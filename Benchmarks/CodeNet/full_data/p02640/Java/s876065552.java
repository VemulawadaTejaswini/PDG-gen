import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();



        for (int i = 0; i<=x; i++ ) {
            int j = x - i;
            int n = i * 2 + j * 4;
            if (n == y) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }


}