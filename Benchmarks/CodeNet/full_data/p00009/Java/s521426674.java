import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int sosu = sc.nextInt();
            if(sosu == 0) break;
            boolean s = true;
            if(sosu == 1) {
                s = false;
            }
            for (int i = 2; i < sosu; i++) {
                if (sosu % i == 0) {
                    s = false;

                    break;

                }
            }
            if (s) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}