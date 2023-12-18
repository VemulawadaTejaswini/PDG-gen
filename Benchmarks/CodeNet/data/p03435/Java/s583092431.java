import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c11 = sc.nextInt();
        int c12 = sc.nextInt();
        int c13 = sc.nextInt();
        int c21 = sc.nextInt();
        int c22 = sc.nextInt();
        int c23 = sc.nextInt();
        int c31 = sc.nextInt();
        int c32 = sc.nextInt();
        int c33 = sc.nextInt();
        
        for (int a1=0; a1<201; a1++) {
            int b1 = c11 - a1;
            int b2 = c12 - a1;
            int b3 = c13 - a1;
            int a2 = c23 - b3;
            int a3 = c33 - b3;

            if (a2 + b1 == c21 && a2 + b2 == c22 && a2 + b3 == c23 &&
                    a3 + b1 == c31 && a3 + b2 == c32 && a3 + b3 == c33) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
        return;
    }
}

