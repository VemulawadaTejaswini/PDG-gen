import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i=1; i<=x; i++) {
            for(int j=1; j<=x; j++) {
                if(y == (i*2)+(j*4)) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        for(int i=1; i<=x; i++) {
            for(int j=1; j<=x; j++) {
                if(y == (j*2)+(i*4)) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        for(int i=1; i<=x; i++) {
            if(y == i*2) {
                System.out.println("Yes");
                return;
            }
            if(y == i*4) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}