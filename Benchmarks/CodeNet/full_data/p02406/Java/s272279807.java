import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(" ");
        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0) {
                System.out.print(" "+i);
            } else {
                int j = i;
                while (j!=0) {
                    if (j% 10 == 3) {
                        System.out.print(" "+i);
                        break;
                    } else {
                        j /= 10;
                    }
                }
            }
        }
    }
}


