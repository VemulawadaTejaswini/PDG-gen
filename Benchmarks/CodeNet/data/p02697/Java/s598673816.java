
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), m = in.nextInt();

        /*
          9
        1 8
        2 7
        
        3 6
        4 5
        */
        int p = n / 2 + 1 - m;
        int q = n / 2 + m;
        for (int i=0;i<m;i++) {
            System.out.println((p+i) + " " + (q-i));
        }
    }
}
