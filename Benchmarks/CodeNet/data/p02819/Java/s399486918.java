import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC149C - Next Prime

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        boolean isSosu = false;
        while(!isSosu) {
            isSosu = true;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    isSosu = false;
                    x++;
                    break;
                }
            }
        }

        System.out.println(x);
    }
}