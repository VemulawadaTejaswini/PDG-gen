import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[2][2];
        a[0][0] = in.nextInt();
        a[0][1] = in.nextInt();
        a[1][0] = in.nextInt();
        a[1][1] = in.nextInt();
        
        int attack = 0;
        int defence = 1;
        while (true) {
            a[defence][0] -= a[attack][1];
            if (a[defence][0] <= 0) {
                if (attack == 0) {
                    System.out.println("Yes");
                    return;
                } else {
                    System.out.println("No");
                    return;
                }
            }
            attack = (attack + 1) % 2;
            defence = (defence + 1) % 2;
        }
    }
}

