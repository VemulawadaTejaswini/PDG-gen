
import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        for (;;) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 && b == 0)
                break;
            for (int j = 0; j < a; j++) {
                for (int k = 0; k < b; k++) {
                    if((j+k)%2==0)
                        System.out.print("#");
                    else
                        System.out.print(".");
                }
                System.out.println();
            }

            System.out.println();
        }
    }
}

