import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int[] t = new int[4];
            for (int i = 0; i < 4; i++) {
                t[i] = sc.nextInt();
            }
            Arrays.sort(t);
            if ( t[0] == t[1] && t[2] == t[3] ) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

